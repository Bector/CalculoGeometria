package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultadoRectangulo extends AppCompatActivity {
    private TextView txtAreaR,txtPerimetroR,txtDiagonalR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rectangulo);


        String Base=getIntent().getStringExtra("variable3");
        double Base2=Integer.parseInt(Base);

        String Altura=getIntent().getStringExtra("variable4");
        double Altura2=Integer.parseInt(Altura);



        double resultadoArea, resultadoPerimetro;
        double  resultadoDiagonal,Diagonal;
        resultadoArea=Base2*Altura2;
        resultadoPerimetro=2*(Base2+Altura2);
        Diagonal=Math.pow(Base2,2)+Math.pow(Altura2,2);
        resultadoDiagonal=Math.sqrt(Diagonal);

        DecimalFormat format=new DecimalFormat("#.00");

        txtAreaR=(TextView) findViewById(R.id.txtAreaR);
        txtAreaR.setText("Area: "+format.format(resultadoArea));

        txtPerimetroR=(TextView) findViewById(R.id.txtPerimetroR);
        txtPerimetroR.setText("Perimetro: "+format.format(resultadoPerimetro));

        txtDiagonalR=(TextView) findViewById(R.id.txtDiagonalR);
        txtDiagonalR.setText("Diagonal: "+format.format(resultadoDiagonal));
    }
}
