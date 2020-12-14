package com.example.eva2_7_activityresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intento;
    final int Main_Activity2 = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intento = new Intent(this, MainActivity2.class);
    }
    public void onClick(View v){
        startActivityForResult(intento, Main_Activity2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case Main_Activity2:
                if (resultCode== Activity.RESULT_OK){

                }
             break;
            default:
        }

    }
}