package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Boton para ir a el consumo
        Button btn12j = findViewById(R.id.btn12);

        //Accion de ir desde el inicio al consumo
        btn12j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Defino lo que va suceder con el accionar del clic
                Intent ir1a2 = new Intent(MainActivity.this, Consumption.class);
                //Inicio la actividad que definí en el intent
                startActivity(ir1a2);
            }
        });

        //Voy a crear todos los demas botones
        Button btn13j = findViewById(R.id.btn13);
        Button btn14j = findViewById(R.id.btn14);
        Button btn15j = findViewById(R.id.btn15);
        Button btn16j = findViewById(R.id.btn16);

        //Voy a crear todos los redireccionamientos
        //Ir desde inicio a consejos
        btn13j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir1a3 = new Intent(MainActivity.this, Tips.class);
                startActivity(ir1a3);
            }
        });
        //Ir desde inicio a progreso
        btn14j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir1a4 = new Intent(MainActivity.this, Progress.class);
                startActivity(ir1a4);
            }
        });
        //Ir desde inicio a información
        btn15j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir1a5 = new Intent(MainActivity.this, Info.class);
                startActivity(ir1a5);
            }
        });
        //Ir desde inicio a configuración
        btn16j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir1a6 = new Intent(MainActivity.this, Settings.class);
                startActivity(ir1a6);
            }
        });

    }
}