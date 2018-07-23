package com.javiersl.projectfinalnextu;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, FacebookCallback<LoginResult>
{
    public static final String USUARIO = "USUARIO";
    private CallbackManager callbackManager;
    private ProfileTracker profileTracker;
    private GoogleApiClient apiClient;
    private static final int REQUEST_CODE = 1;
    private static final String PERMISOS[] = {Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.READ_CONTACTS};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Permisos
        int localizacion = ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        int contactos = ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS);

        if(localizacion != PackageManager.PERMISSION_GRANTED || contactos != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, PERMISOS, REQUEST_CODE);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Inicio de sesión");

        //Checa si se está logeado en Facebook (si es así, se deslogea)
        if (AccessToken.getCurrentAccessToken() != null)
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

        SignInButton btGoogle = (SignInButton) findViewById(R.id.btGoogle);
        final LoginButton btFacebook = (LoginButton) findViewById(R.id.btFacebook);

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
                if (currentProfile != null)
                {
                    //Hace la peticion del permiso para obtener la informacion del usuario
                    GraphRequest request = GraphRequest.newMeRequest(AccessToken.getCurrentAccessToken(), new GraphRequest.GraphJSONObjectCallback()
                    {
                        @Override
                        public void onCompleted(JSONObject object, GraphResponse response)
                        {
                            try
                            {
                                Intent intent = new Intent(LoginActivity.this, AsistenteActivity.class);

                                String usuario = object.getString("email") != null ?
                                        object.getString("email") : object.getString("name");

                                intent.putExtra(USUARIO, usuario);
                                startActivity(intent);
                                finish();
                            } catch (JSONException e)
                            {
                                e.printStackTrace();
                                Toast.makeText(LoginActivity.this, "Error al obtener correo de Facebook", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    //Arma la peticion y los parametros a obtener para ejecutarlos
                    Bundle params = new Bundle();
                    params.putString("fields", "id,name,link,email");

                    request.setParameters(params);
                    request.executeAsync();
                }
            }
        };
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        //Comienza el tracking
        setTitle("Asistente de Seguridad");
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

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK)
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
        if (result.isSuccess())
        {
            //Para obtener el correo del usuario
            GoogleSignInAccount account = result.getSignInAccount();

            Intent intent = new Intent(this, AsistenteActivity.class);
            intent.putExtra(USUARIO, account.getEmail());
            startActivity(intent);
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
