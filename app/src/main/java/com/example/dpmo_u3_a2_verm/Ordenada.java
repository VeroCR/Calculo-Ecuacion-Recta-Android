package com.example.dpmo_u3_a2_verm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Ordenada extends AppCompatActivity {

    TextView txtResultado;
    TextView txtFormaGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordenada);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnRegresar = findViewById(R.id.btnRegresar);
        EditText txtM = findViewById(R.id.txtM);
        EditText txtB = findViewById(R.id.txtB);
        txtResultado = findViewById(R.id.txtResultado);
        txtFormaGeneral = findViewById(R.id.txtFormaGeneral);

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String M = txtM.getText().toString();
                String B = txtB.getText().toString();
                if(M.equals("") || B.equals("")){
                    Toast.makeText(Ordenada.this, "Agregue los valores de B y M", Toast.LENGTH_LONG).show();
                }else{
                    int m = Integer.parseInt(M);
                    int b = Integer.parseInt(B);
                    if (b < 0)
                    {
                        txtResultado.setText("y = " + m + "x " + b);
                        txtFormaGeneral.setText(-(m) + "x + y + " + -(b) + " = 0");
                    }
                    else
                    {
                        txtResultado.setText("y = " + m + "x + " + b);
                        txtFormaGeneral.setText(-(m) + "x + y " + -(b) + " = 0");
                    }
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });

    }
}