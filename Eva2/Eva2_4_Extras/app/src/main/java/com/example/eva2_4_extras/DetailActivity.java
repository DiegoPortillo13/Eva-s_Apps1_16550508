package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView txtD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtD = findViewById(R.id.textView);
        Intent intent = getIntent();
        txtD.append(intent.getStringExtra("Mensaje"));
        txtD.append(""+intent.getIntExtra("Entero",100));
        txtD.append(""+intent.getFloatExtra("Precio", 20.0f));
    }
}