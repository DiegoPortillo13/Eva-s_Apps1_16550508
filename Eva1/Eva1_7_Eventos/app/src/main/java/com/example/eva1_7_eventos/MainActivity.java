package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnL, btnA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnL=findViewById(R.id.button3);
        btnA=findViewById(R.id.button4);
        btnL.setOnClickListener(this);
        View.OnClickListener myCA =new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hola Mundo Cruel Por Clase Anonima!!", Toast.LENGTH_LONG).show();
            }
        };
        btnA.setOnClickListener(myCA);/*
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Hola Mundo Cruel Por Clase Anonima!!", Toast.LENGTH_LONG).show();
                    }
                }
        );*/
    }
    public void myC(View view) {
        Toast.makeText(this,"Hola Mundo Cruel!!",Toast.LENGTH_LONG).show();
        Log.wtf("HDP","Esta fallando ue checalo");
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Hola Mundo Cruel Por Interfaz!!",Toast.LENGTH_LONG).show();
    }
}