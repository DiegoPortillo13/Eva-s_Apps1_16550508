package com.example.eva1_exam1_calcularvolumen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    TextView textView4;
    EditText number;
    Button boton;
    int Ang = 0;
    int Rad = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar2);
        textView4 = findViewById(R.id.textView4);
        number = findViewById(R.id.editTextNumber);
        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int Rad = Integer.parseInt(number.getText().toString());
                CalcVol(Ang, Rad);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textView4.setText(Integer.toString(i));
                Ang=i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }

        });
    }
    public void CalcVol(int A,int R ){

       Double Vol = ((float)2/3)*(A*(Math.pow(R, 3)));
       Log.wtf("HDP1", Double.toString(Vol));
        Log.wtf("HDP", Integer.toString(A));
        Log.wtf("HDPM", Integer.toString(R));
        Toast.makeText(this, "Resultado "+Vol, Toast.LENGTH_LONG).show();


    }
}