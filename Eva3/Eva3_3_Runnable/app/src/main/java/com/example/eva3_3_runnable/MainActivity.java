package com.example.eva3_3_runnable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Runnable rRunable = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                try {
                    Thread.sleep(1000);
                    Log.wtf("Runnable", i + "");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(rRunable);
        thread.start();
        rRuneablem miR = new rRuneablem();
        Thread thread1 = new Thread(miR);

    }
}

class rRuneablem implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
                Log.wtf("Runnable", i + "");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}