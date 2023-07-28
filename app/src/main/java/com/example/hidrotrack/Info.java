package com.example.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button btn51j = findViewById(R.id.btn51);
        btn51j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Primero debo generar el intento (Digo donde está el interruptor)
                Intent ir5a1 = new Intent(Info.this,MainActivity.class);
                //Ahora le doy inicio a ese interruptor
                startActivity(ir5a1);
            }
        });
    }
}