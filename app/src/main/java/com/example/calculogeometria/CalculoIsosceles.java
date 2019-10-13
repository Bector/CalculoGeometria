package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoIsosceles extends AppCompatActivity {
    private EditText etLadoIgual,etLado2;
    private Button btn_calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_isosceles);
    }
    public void btnCalcular(View v) {
        etLadoIgual = (EditText) findViewById(R.id.etLadoIgual);
        etLado2 = (EditText) findViewById(R.id.etLado2);
        if (etLadoIgual.getText().toString().isEmpty()||etLado2.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Los campos no deben estar vacíos",Toast.LENGTH_LONG).show();

        }else {
            Intent intent = new Intent(this, ResultadoIsosceles.class);
            intent.putExtra("variable", etLadoIgual.getText().toString());
            intent.putExtra("variable2", etLado2.getText().toString());
            startActivity(intent);
        }
    }
}
