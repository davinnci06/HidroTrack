package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MiApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se crea la animación de entrada
        Animation animj = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);

        //Boton para ir a el consumo
        Button btn12j = findViewById(R.id.btn12);

        //Se aplica la animácion al boton de consumo
        btn12j.startAnimation(animj);

        //Accion de ir desde el inicio al consumo
        btn12j.setOnClickListener(v -> {
            //Defino lo que va suceder con el accionar del clic
            Intent ir1a2 = new Intent(MainActivity.this, Consumption.class);
            //Inicio la actividad que definí en el intent
            startActivity(ir1a2);
        });

        //Creamos todos los demas botones
        Button btn13j = findViewById(R.id.btn13);
        Button btn14j = findViewById(R.id.btn14);
        Button btn15j = findViewById(R.id.btn15);
        Button btn16j = findViewById(R.id.btn16);

        //Se aplica la animación a cada boton
        btn13j.startAnimation(animj);
        btn14j.startAnimation(animj);
        btn15j.startAnimation(animj);
        btn16j.startAnimation(animj);

        //Voy a crear todos los redireccionamientos
        //Ir desde inicio a consejos
        btn13j.setOnClickListener(v -> {
            Intent ir1a3 = new Intent(MainActivity.this, Tips.class);
            startActivity(ir1a3);
        });
        //Ir desde inicio a progreso
        btn14j.setOnClickListener(v -> {
            Intent ir1a4 = new Intent(MainActivity.this, Progress.class);
            startActivity(ir1a4);
        });
        //Ir desde inicio a información
        btn15j.setOnClickListener(v -> {
            Intent ir1a5 = new Intent(MainActivity.this, Info.class);
            startActivity(ir1a5);
        });
        //Ir desde inicio a configuración
        btn16j.setOnClickListener(v -> {
            Intent ir1a6 = new Intent(MainActivity.this, Settings.class);
            startActivity(ir1a6);
        });

        Log.d(TAG, "Mensaje de depuración"); // Mensaje de depuración
        Log.i(TAG, "Mensaje de información"); // Mensaje de información
        Log.w(TAG, "Mensaje de advertencia"); // Mensaje de advertencia
        Log.e(TAG, "Mensaje de error"); // Mensaje de error

    }
}