package com.example.dpmo_u3_a2_verm;

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

        Button btnTerminar = (Button) findViewById(R.id.btnTerminar);
        Button btnOrdenada = findViewById(R.id.btnOrigen);
        Button btnPendiente = findViewById(R.id.btnPendiente);

        btnOrdenada.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Ordenada.class);
                startActivity(i);
            }
        });

        btnPendiente.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Pendiente.class);
                startActivity(i);
            }
        });

        btnTerminar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
                System.exit(0);
            }
        });
    }
}