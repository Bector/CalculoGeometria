package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SeleccionFigura extends AppCompatActivity {
    private Button btnSeleccionar;
    private RadioButton rdCuadrado,rdRectangulo,rbCirculo,rbRombo,rbTEquilatero,rbTIsósceles,rbTEscaleno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_figura);
    }
    public void btnSeleccionar(View v){

        rdCuadrado =(RadioButton) findViewById(R.id.rdCuadrado);
        rdRectangulo=(RadioButton) findViewById(R.id.rdRectangulo);
        rbCirculo=(RadioButton) findViewById(R.id.rbCirculo);
        rbRombo=(RadioButton) findViewById(R.id.rbRombo);
        rbTEquilatero=(RadioButton) findViewById(R.id.rbTEquilatero);
        rbTIsósceles=(RadioButton) findViewById(R.id.rbTIsósceles);
        rbTEscaleno=(RadioButton) findViewById(R.id.rbTEscaleno);


           if (rdCuadrado.isChecked()){
                startActivity(new Intent(this, CalculoCuadrado.class));
        }
        if (rdRectangulo.isChecked()){
            startActivity(new Intent(this, CalculoRectangulo.class));
        }
        if (rbCirculo.isChecked()){
            startActivity(new Intent(this, CalculoCirculo.class));
        }
        if (rbRombo.isChecked()){
            startActivity(new Intent(this, CalculoRombo.class));
        }
        if (rbTEquilatero.isChecked()){
            startActivity(new Intent(this, CalculoEquilateros.class));
        }
        if (rbTIsósceles.isChecked()){
            startActivity(new Intent(this, CalculoIsosceles.class));
        }
        if (rbTEscaleno.isChecked()){
            startActivity(new Intent(this, CalculoEscaleno.class));
        }



    }
}
