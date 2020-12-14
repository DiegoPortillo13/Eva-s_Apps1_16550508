package com.example.eva1_9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       final RadioGroup radId,radG;
        final RadioButton btnEs, btnEn, btnH,btnM,btnO;
        final TextView txtId,txtgGen,txtN,txtA;
        final EditText hN, hA;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radId=findViewById(R.id.RadioGId);
        btnEs=findViewById(R.id.radioButton4);
        btnEn=findViewById(R.id.radioButton2);
        btnH=findViewById(R.id.radioButton3);
        btnM=findViewById(R.id.radioButton5);
        btnO=findViewById(R.id.radioButton6);
        txtId=findViewById(R.id.textView);
        txtgGen=findViewById(R.id.textView5);
        txtA=findViewById(R.id.textView3);
        txtN=findViewById(R.id.textView2);
        hA=findViewById(R.id.editTextTextPersonName2);
        hN=findViewById(R.id.editTextTextPersonName);
        radId.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i==R.id.radioButton4){
                    btnEs.setText(R.string.btn_ES_es);
                    btnEn.setText(R.string.btn_EN_es);
                    btnH.setText(R.string.btn_H_es);
                    btnM.setText(R.string.btn_M_es);
                    btnO.setText(R.string.btn_o_es);
                    txtId.setText(R.string.txt_Idioma_es);
                    txtgGen.setText(R.string.txt_Gen_es);
                    txtN.setText(R.string.txt_Nom_es);
                    txtA.setText(R.string.txt_Ap_es);
                    hA.setText(R.string.h_Ap_es);
                    hN.setText(R.string.h_Nom_es);
                }else if (i==R.id.radioButton2){
                    btnEn.setText(R.string.btn_ES);
                    btnEs.setText(R.string.btn_EN);
                    btnH.setText(R.string.btn_H);
                    btnM.setText(R.string.btn_M);
                    btnO.setText(R.string.btn_o);
                    txtId.setText(R.string.txt_Idioma);
                    txtgGen.setText(R.string.txt_Gen);
                    txtN.setText(R.string.txt_Nom);
                    txtA.setText(R.string.txt_Ap);
                    hA.setText(R.string.h_Ap);
                    hN.setText(R.string.h_Nom);
                }
            }
        });
    }
}