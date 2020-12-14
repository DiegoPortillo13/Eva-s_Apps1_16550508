package com.example.eva1_12_orientacion_codigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
    Button btnAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAcc = findViewById(R.id.button);
        btnAcc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int iOr=getResources().getConfiguration().orientation;
        if (iOr== Configuration.ORIENTATION_PORTRAIT)
            Toast.makeText(this,"Modo Portrait!!",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Modo Landscape!!",Toast.LENGTH_LONG).show();
    }
}