package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

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
        //Enlazo el Spinner de la vista con el de java
        Spinner sp1j = findViewById(R.id.sp1);
        ArrayList Lista = new ArrayList();
        Lista.add("Uno");
        Lista.add("Dos");
        Lista.add("Tres");
        Lista.add("Cuatro");

        ArrayAdapter adap = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Lista);
        sp1j.setAdapter(adap);
    }
}