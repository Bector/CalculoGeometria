package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultadoEscaleno extends AppCompatActivity {
    private TextView txtArea,txtPerimetro,txtSemiperimetro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_escaleno);

        String lado1=getIntent().getStringExtra("variable1");
        double lado11=Integer.parseInt(lado1);
        String lado2=getIntent().getStringExtra("variable2");
        double lado22=Integer.parseInt(lado2);
        String lado3=getIntent().getStringExtra("variable3");
        double lado33=Integer.parseInt(lado3);



        double  resultadoArea,resultadoSemiperimetro,resultadoPerimetro;
        resultadoSemiperimetro=(lado11+lado22+lado33)/2;
        resultadoArea=Math.sqrt(resultadoSemiperimetro*(resultadoSemiperimetro-lado11)*(resultadoSemiperimetro-lado22)*(resultadoSemiperimetro-lado33));
        resultadoPerimetro=lado11+lado22+lado33;


        DecimalFormat format=new DecimalFormat("#.00");

        txtArea=(TextView) findViewById(R.id.txtArea);
        txtArea.setText("Area: "+format.format(resultadoArea));

        txtPerimetro=(TextView) findViewById(R.id.txtPerimetro);
        txtPerimetro.setText("Perimetro: "+format.format(resultadoPerimetro));

        txtSemiperimetro=(TextView) findViewById(R.id.txtSemiperimetro);
        txtSemiperimetro.setText("SemiPerimetro: "+format.format(resultadoSemiperimetro));
    }
}
