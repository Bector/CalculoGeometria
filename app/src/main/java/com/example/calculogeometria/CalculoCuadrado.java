package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoCuadrado extends AppCompatActivity {
    private EditText etMedida;
    public int Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_cuadrado);
    }
    public void btnCalcular(View v){
        etMedida=(EditText) findViewById(R.id.etMedida);

        if (etMedida.getText().toString().isEmpty()){

            Toast notificacion=Toast.makeText(getApplicationContext(), "El campo no debe estar vacio", Toast.LENGTH_LONG);
            notificacion.show();

        }else {
            Intent intent=new Intent(this, ResultadoCuadrado.class);
            intent.putExtra("variable", etMedida.getText().toString());
            startActivity(intent);
        }


    }
}
