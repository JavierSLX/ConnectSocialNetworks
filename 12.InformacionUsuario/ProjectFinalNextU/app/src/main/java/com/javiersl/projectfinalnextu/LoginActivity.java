package com.javiersl.projectfinalnextu;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.media.MediaCas;
import android.media.tv.TvInputService;
import android.service.textservice.SpellCheckerService;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

public class LoginActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, FacebookCallback<LoginResult>
{
    private CallbackManager callbackManager;
    private ProfileTracker profileTracker;
    private GoogleApiClient apiClient;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Checa si se está logeado en Facebook (si es así, se deslogea)
        if(AccessToken.getCurrentAccessToken() != null)
            LoginManager.getInstance().logOut();

        //Obtiene las opciones y el correo de Google
        GoogleSignInOptions options = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        //Gestiona el ciclo de vida del cliente con el de la actividad
        apiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, options)
                .build();

        SignInButton btGoogle = (SignInButton)findViewById(R.id.btGoogle);
        final LoginButton btFacebook = (LoginButton)findViewById(R.id.btFacebook);

        //Crea el callback manager y los permisos
        callbackManager = CallbackManager.Factory.create();
        btFacebook.setReadPermissions("public_profile", "email");
        btFacebook.registerCallback(callbackManager, this);

        //Personaliza el boton de autenticacion
        btGoogle.setSize(SignInButton.SIZE_WIDE);
        btGoogle.setColorScheme(SignInButton.COLOR_DARK);

        //Evento del boton Google
        btGoogle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = Auth.GoogleSignInApi.getSignInIntent(apiClient);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        //Cuando se detecta un inicio de sesion en Facebook
        profileTracker = new ProfileTracker()
        {
            @Override
            protected void onCurrentProfileChanged(Profile oldProfile, Profile currentProfile)
            {
                //Pasa a la siguiente actividad si se logeo
                if(currentProfile != null)
                {
                    startActivity(new Intent(LoginActivity.this, AsistenteActivity.class));
                    btFacebook.clearPermissions();
                    finish();
                }
            }
        };
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        //Comienza el tracking
        profileTracker.startTracking();
    }

    @Override
    protected void onStop()
    {
        super.onStop();

        //Detiene el tracking
        profileTracker.stopTracking();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK)
        {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);

            //Procesa el resultado
            procesarResultadoGoogle(result);
        }

        //Callback de facebook
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    private void procesarResultadoGoogle(GoogleSignInResult result)
    {
        if(result.isSuccess())
        {
            startActivity(new Intent(this, AsistenteActivity.class));
            finish();
        }
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult)
    {
        Toast.makeText(this, "Error al conectar con Google", Toast.LENGTH_SHORT).show();
    }

    //Cuando el login se hace de manera correcta
    @Override
    public void onSuccess(LoginResult loginResult)
    {
        Log.i(LoginActivity.class.getSimpleName(), "Inicio de sesion correcto");
    }

    //Cuando se cancela el login de Facebook
    @Override
    public void onCancel()
    {
        Toast.makeText(this, "Se ha cancelado el inicio de sesión en Facebook", Toast.LENGTH_SHORT).show();
    }

    //Error en el login de Facebook
    @Override
    public void onError(FacebookException error)
    {
        Toast.makeText(this, "Error al iniciar con Facebook", Toast.LENGTH_SHORT).show();
    }
}
