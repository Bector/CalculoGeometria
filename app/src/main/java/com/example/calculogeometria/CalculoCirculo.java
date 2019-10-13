package com.example.calculogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.ExecutionException;

public class CalculoCirculo extends AppCompatActivity {

    private  EditText etRadio;
    private Button btnCirculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_circulo);
    }

    public void btnCalcularRadio(View v){
        etRadio=(EditText) findViewById(R.id.etRadio);
        try {
            if (etRadio.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(),"El campo no debe estar vacío",Toast.LENGTH_LONG).show();
            }else {
                Intent intent2=new Intent(this, ResultadoCirculo.class);
                intent2.putExtra("variable2", etRadio.getText().toString());
                startActivity(intent2);
            }
        } catch (Exception e){
            Toast.makeText(getApplicationContext(),"Error: ",Toast.LENGTH_SHORT).show();
        }




    }
}
