package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnIngresar,Qsomos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnIngresar(View v){
        startActivity(new Intent(this, SeleccionFigura.class));
    }

    public void btnQsomo(View v){
        startActivity(new Intent(this,QuienesSomos.class));
    }
}
