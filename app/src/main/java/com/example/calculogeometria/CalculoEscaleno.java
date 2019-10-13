package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoEscaleno extends AppCompatActivity {
    private EditText etLado1, etLado2, etLado3;
    private Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_escaleno);
    }

    public void btnCalcular(View v) {
        etLado1 = (EditText) findViewById(R.id.etLado1);
        etLado2 = (EditText) findViewById(R.id.etLado2);
        etLado3 = (EditText) findViewById(R.id.etLado3);
        if (etLado1.getText().toString().isEmpty()||etLado2.getText().toString().isEmpty()||etLado3.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Los campos no debe estar vacíos",Toast.LENGTH_LONG).show();

        }else {
            Intent intent = new Intent(this, ResultadoEscaleno.class);
            intent.putExtra("variable1", etLado1.getText().toString());
            intent.putExtra("variable2", etLado2.getText().toString());
            intent.putExtra("variable3", etLado3.getText().toString());
            startActivity(intent);
        }
    }
}