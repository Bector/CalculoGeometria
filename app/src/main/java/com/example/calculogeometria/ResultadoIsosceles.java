package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultadoIsosceles extends AppCompatActivity {
    private TextView txtArea,txtPerimetro,txtSemiperimetro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_isosceles);

        String ladoIgual=getIntent().getStringExtra("variable");
        double ladoIgual2=Integer.parseInt(ladoIgual);
        String lado2=getIntent().getStringExtra("variable2");
        double lado22=Integer.parseInt(lado2);
        
        double  resultadoArea,resultadoSemiperimetro,resultadoPerimetro;
        resultadoArea=(lado22*Math.sqrt(Math.pow(ladoIgual2,2)-((Math.pow(lado22,2)/4))))/2;
        resultadoPerimetro=(2*ladoIgual2)+lado22;
        resultadoSemiperimetro=(ladoIgual2+ladoIgual2+lado22)/2;

        DecimalFormat format=new DecimalFormat("#.00");

        txtArea=(TextView) findViewById(R.id.txtArea);
        txtArea.setText("Area: "+format.format(resultadoArea));

        txtPerimetro=(TextView) findViewById(R.id.txtPerimetro);
        txtPerimetro.setText("Perimetro: "+format.format(resultadoPerimetro));

        txtSemiperimetro=(TextView) findViewById(R.id.txtSemiperimetro);
        txtSemiperimetro.setText("SemiPerimetro: "+format.format(resultadoSemiperimetro));
    }
}
