package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Progress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        Button btn41j = findViewById(R.id.btn41);
        btn41j.setOnClickListener(v -> {
            //Primero debo generar el intento (Digo donde está el interruptor)
            Intent ir4a1 = new Intent(Progress.this,MainActivity.class);
            //Ahora le doy inicio a ese interruptor
            startActivity(ir4a1);
        });

    }
}