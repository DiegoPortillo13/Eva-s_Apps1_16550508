package com.example.eva3_7_handlerrunnable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtD;
    int i;
    Handler mHand = new Handler();

    Runnable backRun= new Runnable() {
        @Override
        public void run() {
            i = 0;
            while(true){
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                mHand.post(foreRun);
                Log.wtf("Runnable", i + "");
                //txtD.append(i + "\n");
                i++;
            }
        }
    };

    Runnable foreRun= new Runnable() {
        @Override
        public void run() {
        txtD.append("Valor i = "+ i + "\n");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtD.findViewById(R.id.txtDatos);

        Thread hilo = new Thread(backRun);
        hilo.start();
    }
}