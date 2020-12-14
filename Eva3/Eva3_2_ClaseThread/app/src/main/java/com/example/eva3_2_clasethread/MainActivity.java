package com.example.eva3_2_clasethread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread tHilo = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0;i<10;i++){
                    try {
                        Thread.sleep(1000);
                        Log.wtf("Mi Hilo ", i +"");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        tHilo.start();
        tHilote miHilote = new tHilote();
        miHilote.start();
    }
}
class tHilote extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0;i<10;i++){
            try {
                Thread.sleep(1000);
                Log.wtf("Mi Hilo 2 ", i +"");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
