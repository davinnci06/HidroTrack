package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        //Crear el boton
        Button btn31j = findViewById(R.id.btn31);
        btn31j.setOnClickListener(v -> {
            //Primero debo generar el intento (Digo donde está el interruptor)
            Intent ir3a1 = new Intent(Tips.this,MainActivity.class);
            //Ahora le doy inicio a ese interruptor
            startActivity(ir3a1);
        });
    }
}