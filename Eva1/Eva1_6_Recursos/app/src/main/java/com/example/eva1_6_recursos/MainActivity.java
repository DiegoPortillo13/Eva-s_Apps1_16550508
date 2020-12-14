package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgV;
    TextView txtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtV.findViewById(R.id.textView);
        imgV=findViewById(R.id.imgV);
        imgV.setImageResource(R.drawable.im2);
        txtV.setText(R.string.myD);

    }
}