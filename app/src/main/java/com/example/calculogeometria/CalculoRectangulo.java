package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoRectangulo extends AppCompatActivity {

    private EditText etBase,etAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_rectangulo);
    }

    public void btnCalcularRectangulo(View v) {
        etBase = (EditText) findViewById(R.id.etBase);
        etAltura = (EditText) findViewById(R.id.etAltura);
        if (etBase.getText().toString().isEmpty() || etAltura.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Los campos no debe estar vacíos", Toast.LENGTH_LONG).show();

        } else {
            Intent intent2 = new Intent(this, ResultadoRectangulo.class);
            intent2.putExtra("variable3", etBase.getText().toString());
            intent2.putExtra("variable4", etAltura.getText().toString());
            startActivity(intent2);
        }
    }
}
