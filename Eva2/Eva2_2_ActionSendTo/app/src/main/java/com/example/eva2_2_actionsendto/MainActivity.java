package com.example.eva2_2_actionsendto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eTelTxt, eMsjTxt;
    Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTelTxt=findViewById(R.id.eTelTxt);
        eMsjTxt=findViewById(R.id.eMsjTxt);
    }

    public void onClick(View v){
        String sTel = "smsto:"+eTelTxt.getText().toString();
        String sMsj=eMsjTxt.getText().toString();
        intento = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        intento.putExtra("sms_body",sMsj);
        startActivity(intento);
    }
}