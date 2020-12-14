package com.example.eva3_6_handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtD;
    Handler mHand=new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            int vI=(int)msg.obj;
            txtD.append("Hilo "+ msg.what + "Valor de la i = "+ vI + "\n");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtD = findViewById(R.id.txtDatos);

        Thread tHilo = new Thread(){
            @Override
            public void run() {
                super.run();
                int i = 0;
                while(true){
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    Message msg = mHand.obtainMessage(1000, i);
                    mHand.sendMessage(msg);
                    Log.wtf("Runnable", i + "");
                    //txtD.append(i + "\n");
                    i++;
                }
            }
        };
        tHilo.start();
    }
}