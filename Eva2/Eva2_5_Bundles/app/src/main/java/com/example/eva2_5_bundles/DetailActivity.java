package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtV=findViewById(R.id.txtV);
        Intent intento = getIntent();
        Bundle bundle = intento.getExtras();
        txtV.append(bundle.getString("Ciudad"));
        txtV.append(bundle.getString("Posicion")+"");
    }
}