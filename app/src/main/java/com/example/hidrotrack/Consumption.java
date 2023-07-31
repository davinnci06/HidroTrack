package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Consumption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumption);

        //Debo redireccionar los botones reales con los lógicos
        //Primero creo los botones
        Button btn23j = findViewById(R.id.btn23);

        //Segundo les activo la escucha
        btn23j.setOnClickListener(v -> {
            // Mensaje a mostrar cuando se hace clic en el botón
            Toast.makeText(Consumption.this, "¡Registro guardado!", Toast.LENGTH_SHORT).show();
            //Primero debo generar el intento (Digo donde está el interruptor)
            Intent ir2a3 = new Intent(Consumption.this,Tips.class);
            //Ahora le doy inicio a ese interruptor
            startActivity(ir2a3);
        });
        // Lo mismo para el segundo botón
        Button btn21j = findViewById(R.id.btn21);

        btn21j.setOnClickListener(v -> {
            //Primero debo generar el intento (Digo donde está el interruptor)
            Intent ir2a1 = new Intent(Consumption.this,MainActivity.class);
            //Ahora le doy inicio a ese interruptor
            startActivity(ir2a1);
        });
    }
}