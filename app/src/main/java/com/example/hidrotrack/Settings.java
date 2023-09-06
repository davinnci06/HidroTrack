package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Botón de guardar
        Button btn62j = findViewById(R.id.btn62);
        btn62j.setOnClickListener(v -> {
            // Mensaje a mostrar cuando se hace clic en el botón
            Toast.makeText(Settings.this, "¡Confiuración guardada!", Toast.LENGTH_SHORT).show();
            //Primero debo generar el intento (Digo donde está el interruptor)
            Intent ir6a2 = new Intent(Settings.this,Consumption.class);
            //Ahora le doy inicio a ese interruptor
            startActivity(ir6a2);
        });
        // Botón de regresar
        Button btn61j = findViewById(R.id.btn61);
        btn61j.setOnClickListener(v -> {
            //Primero debo generar el intento (Digo donde está el interruptor)
            Intent ir6a1 = new Intent(Settings.this,MainActivity.class);
            //Ahora le doy inicio a ese interruptor
            startActivity(ir6a1);
        });

        //Enlazo el Spinner de la vista con el de java
        Spinner sp1j = findViewById(R.id.sp1);
        //Creo una lista para mostrar las opciones a elegir
        ArrayList<String> Opcion = new ArrayList<>();
        //Agrego los elementos a mostrar en mi lista
        Opcion.add("Grupo 02");
        Opcion.add("Grupo 14");
        Opcion.add("Grupo 17");
        Opcion.add("Grupo 19");

        //Creo un adaptador para que la lista se muestra en modo menu desplegable
        ArrayAdapter<String> adap = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Opcion);
        //Ajusto la lista al spinner con un desplazamiento hacia abajo
        sp1j.setAdapter(adap);
    }
}