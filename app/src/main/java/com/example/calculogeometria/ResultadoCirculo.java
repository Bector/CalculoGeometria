package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultadoCirculo extends AppCompatActivity {
    private TextView txtAreaC, txtPerimetroC, txtDiametro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_circulo);

        String area=getIntent().getStringExtra("variable2");
        double area2=Integer.parseInt(area);
        double resultadoArea, resultadoPerimetro;
        double  resultadoDiametro;

        resultadoArea=3.14*(Math.pow(area2,2));

        resultadoPerimetro=(2*3.14)*area2;

        resultadoDiametro=2*area2;

        DecimalFormat format=new DecimalFormat("#.00");

        txtAreaC=(TextView) findViewById(R.id.txtAreaC);
        txtAreaC.setText("Area: "+format.format(resultadoArea));

        txtPerimetroC=(TextView) findViewById(R.id.txtPerimetroC);
        txtPerimetroC.setText("Perimetro: "+format.format(resultadoPerimetro));

        txtDiametro=(TextView) findViewById(R.id.txtDiametro);
        txtDiametro.setText("Diametro: "+format.format(resultadoDiametro));
    }
}
