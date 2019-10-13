package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultadoCuadrado extends AppCompatActivity {
    private TextView txtArea, txtPerimetro, txtDiagonal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_cuadrado);

        String area=getIntent().getStringExtra("variable");
        double area2=Integer.parseInt(area);
        double resultadoArea, resultadoPerimetro;
        double  resultadoDiagonal;
        resultadoArea=area2*area2;
        resultadoPerimetro=area2*4;
        resultadoDiagonal=Math.sqrt(2)*area2;

        DecimalFormat format=new DecimalFormat("#.00");

        txtArea=(TextView) findViewById(R.id.txtArea);
        txtArea.setText("Area: "+format.format(resultadoArea));

        txtPerimetro=(TextView) findViewById(R.id.txtPerimetro);
        txtPerimetro.setText("Perimetro: "+format.format(resultadoPerimetro));

        txtDiagonal=(TextView) findViewById(R.id.txtDiagonal);
        txtDiagonal.setText("Diagonal: "+format.format(resultadoDiagonal));
    }
}
