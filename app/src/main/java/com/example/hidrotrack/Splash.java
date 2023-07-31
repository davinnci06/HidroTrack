package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    //tiempo que durará el splash
    private static final int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Enlace de la imagen del splash lógica con la real
        ImageView splashj = findViewById(R.id.imSplash);
        //Creación de la animacion de entrada
        Animation fadeIn_sp = new AlphaAnimation(0, 1);
        //Tiempo que durara el cambio de pantalla
        fadeIn_sp.setDuration(2000);
        //Inicio de la animación
        splashj.startAnimation(fadeIn_sp);

        //Inicio del método para saltar al incio de la app después de la animación
        splashj.postDelayed(() -> {
                Intent inSplash = new Intent(Splash.this, MainActivity.class);
                startActivity(inSplash);
                finish();
        }, SPLASH_TIME_OUT);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImageView splashj2 = findViewById(R.id.imSplash);
        splashj2.removeCallbacks(null);
    }
}