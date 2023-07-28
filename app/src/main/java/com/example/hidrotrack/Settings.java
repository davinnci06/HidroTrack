package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Botón de guardar
        Button btn62j = findViewById(R.id.btn62);
        btn62j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Primero debo generar el intento (Digo donde está el interruptor)
                Intent ir6a2 = new Intent(Settings.this,Consumption.class);
                //Ahora le doy inicio a ese interruptor
                startActivity(ir6a2);
            }
        });
        // Botón de regresar
        Button btn61j = findViewById(R.id.btn61);
        btn61j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Primero debo generar el intento (Digo donde está el interruptor)
                Intent ir6a1 = new Intent(Settings.this,MainActivity.class);
                //Ahora le doy inicio a ese interruptor
                startActivity(ir6a1);
            }
        });


    }
}