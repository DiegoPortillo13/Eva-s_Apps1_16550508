package com.example.eva1_3_widget2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVwHm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwHm = findViewById(R.id.txtVwDt);
        txtVwHm.setText("Mi Primer Codigo En Android");
    }
}