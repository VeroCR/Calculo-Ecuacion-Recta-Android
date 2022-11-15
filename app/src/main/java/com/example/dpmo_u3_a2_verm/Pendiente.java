package com.example.dpmo_u3_a2_verm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pendiente extends AppCompatActivity {

    TextView txtResultado;
    TextView txtFormaGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendiente);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnRegresar = findViewById(R.id.btnRegresar);
        EditText txtX = findViewById(R.id.txtX);
        EditText txtY = findViewById(R.id.txtY);
        EditText txtPM = findViewById(R.id.txtPM);
        txtResultado = findViewById(R.id.txtResultado);
        txtFormaGeneral = findViewById(R.id.txtFormaGeneral);

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String X = txtX.getText().toString();
                String Y = txtY.getText().toString();
                String M = txtPM.getText().toString();
                if(X.equals("") || Y.equals("") || M.equals("")){
                    Toast.makeText(Pendiente.this, "Agregue los valores.", Toast.LENGTH_LONG).show();
                }else{
                    int x = Integer.parseInt(X);
                    int y = Integer.parseInt(Y);
                    int m = Integer.parseInt(M);
                    int c;
                    c = m*(-x)-(-y);

                    if (x < 0)
                    {
                        if(y < 0)
                        {
                            txtResultado.setText("y +" + -(y) + " = " + m +"(x +"+-(x)+ ")");
                        }
                        else
                        {
                            txtResultado.setText("y" + -(y) + " = " + m + "(x +" + -(x) + ")");
                        }

                    }
                    else
                    {
                        if(y < 0)
                        {
                            txtResultado.setText("y +" + -(y) + " = " + m + "(x" + -(x) + ")");
                        }
                        else
                        {
                            txtResultado.setText("y " + -(y) + " = " + m + "(x" + -(x) + ")");
                        }
                    }
                    if (c < 0)
                    {
                        txtFormaGeneral.setText(m + "x - y " + c + " = 0");
                    }
                    else
                    {
                        txtFormaGeneral.setText(m + "x - y + " + c + " = 0");
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