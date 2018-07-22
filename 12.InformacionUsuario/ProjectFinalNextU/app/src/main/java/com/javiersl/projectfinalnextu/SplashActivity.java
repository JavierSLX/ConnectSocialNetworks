package com.javiersl.projectfinalnextu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity implements Runnable
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Ejecuta el hilo
        new Thread(this).start();
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        finish();
    }
}
