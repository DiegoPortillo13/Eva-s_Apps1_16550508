package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button btnLz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btnLz = findViewById(R.id.btnLz);
         btnLz.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 intent = new Intent(getApplicationContext(), DetailActivity.class);
                 intent.putExtra("Mensaje","Hola mundo ");
                 intent.putExtra("Entero", 100+" ");
                 intent.putExtra("Precio", 20.0f);
                 startActivity(intent);
             }
         });
    }
}