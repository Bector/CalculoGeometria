package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class ResultadoEquilateros extends AppCompatActivity {
    private TextView txtArea,txtPerimetro,txtSemiperimetro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_equilateros);

        String area=getIntent().getStringExtra("variable");
        double area2=Integer.parseInt(area);
        double resultadoPerimetro;
        double  resultadoArea,resultadoSemiperimetro;
        resultadoArea=((Math.sqrt(3))/4)*area2*area2;
        resultadoPerimetro=3*area2;
        resultadoSemiperimetro=resultadoPerimetro/2;

        DecimalFormat format=new DecimalFormat("#.00");

        txtArea=(TextView) findViewById(R.id.txtArea);
        txtArea.setText("Area: "+format.format(resultadoArea));

        txtPerimetro=(TextView) findViewById(R.id.txtPerimetro);
        txtPerimetro.setText("Perimetro: "+format.format(resultadoPerimetro));

        txtSemiperimetro=(TextView) findViewById(R.id.txtSemiperimetro);
        txtSemiperimetro.setText("SemiPerimetro: "+format.format(resultadoSemiperimetro));


    }
}
