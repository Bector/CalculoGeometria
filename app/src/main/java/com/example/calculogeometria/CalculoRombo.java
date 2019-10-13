package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoRombo extends AppCompatActivity {
    EditText etDiagonalMayor,etDiagonalMenor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_rombo);
    }
    public void calcularRombo(View view) {
        etDiagonalMayor = (EditText) findViewById(R.id.etDiagonalMayor);
        etDiagonalMenor = (EditText) findViewById(R.id.etDiagonalMenor);
        if (etDiagonalMayor.getText().toString().isEmpty() || etDiagonalMenor.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Los campos no debe estar vacíos", Toast.LENGTH_LONG).show();

        } else {
            Intent rombo = new Intent(this, ResultadoRombo.class);
            rombo.putExtra("diagonalMayor", etDiagonalMayor.getText().toString());
            rombo.putExtra("diagonalMenor", etDiagonalMenor.getText().toString());
            startActivity(rombo);
        }
    }
}
