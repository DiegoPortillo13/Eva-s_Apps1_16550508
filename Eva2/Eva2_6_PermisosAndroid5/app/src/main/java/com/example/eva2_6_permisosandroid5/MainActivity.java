package com.example.eva2_6_permisosandroid5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intento = new Intent(Intent.ACTION_CALL, Uri.parse("Tel:1301"));
    }
    public void onClick(View v){
        startActivity(intento);
    }
}