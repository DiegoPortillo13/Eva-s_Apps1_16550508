package com.example.eva3_9_imagen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.InflaterInputStream;

public class MainActivity extends AppCompatActivity {
    ImageView imgV;
    Bitmap imgB;
    Handler hImg = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            imgV.setImageBitmap(imgB);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgV=findViewById(R.id.imgV);
        Thread hilo = new Thread(){
            @Override
            public void run() {
                super.run();
                imgB=cImg("https://i.pinimg.com/originals/5c/ff/26/5cff26b317598231b78029e8a9398fb8.jpg");
                Message msg = hImg.obtainMessage();
                hImg.sendMessage(msg);
            }
        };
        hilo.start();
    }

    public Bitmap cImg(String url){
        try {
            InputStream inputStream = (InputStream) new URL(url).getContent();
            Bitmap bMap = BitmapFactory.decodeStream(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}