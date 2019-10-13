package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ResultadoRombo extends AppCompatActivity {
    TextView txtArea,txtPerimetro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rombo);

        String diagonalMayor=getIntent().getStringExtra("diagonalMayor");
        double diagonalMayor2=Integer.parseInt(diagonalMayor);

        String diagonalMenor=getIntent().getStringExtra("diagonalMenor");
        double diagonalMenor2=Integer.parseInt(diagonalMenor);

        double resultadoArea,resultadoPerimetro;

        resultadoArea=(diagonalMayor2*diagonalMenor2)/2;
        resultadoPerimetro=2*(Math.sqrt((diagonalMayor2*diagonalMayor2)+(diagonalMenor2*diagonalMenor2)));

        DecimalFormat format=new DecimalFormat("#.00");

        txtArea=(TextView)findViewById(R.id.txtAreaRombo);
        txtArea.setText("Area: "+format.format(resultadoArea));

        txtPerimetro=(TextView)findViewById(R.id.txtPerimetroRombo);
        txtPerimetro.setText("erimetro: "+format.format(resultadoPerimetro));
    }
}
