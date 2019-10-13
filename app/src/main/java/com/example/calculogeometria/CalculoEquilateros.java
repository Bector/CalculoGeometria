package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoEquilateros extends AppCompatActivity {
    private EditText etLado;
    private Button btn_calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_equilateros);
    }
    public void btnCalcular(View v){
        etLado=(EditText) findViewById(R.id.etLado);
        if (etLado.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"El campo no debe estar vacío",Toast.LENGTH_LONG).show();
        }else{
            Intent intent=new Intent(this, ResultadoEquilateros.class);
            intent.putExtra("variable", etLado.getText().toString());
            startActivity(intent);
        }

    }

}
