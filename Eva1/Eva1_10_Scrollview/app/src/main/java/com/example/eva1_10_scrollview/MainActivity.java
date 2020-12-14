package com.example.eva1_10_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtV;
    final String cade = "Una computadora moderna consta de uno o más procesadores, una memoria principal, discos, impresoras, un teclado, un ratón, una pantalla o monitor, interfaces de red y otros dispositivos de entrada/salida. En general es un sistema complejo. Si todos los programadores de aplicaciones\n" +
            "tuvieran que comprender el funcionamiento de todas estas partes, no escribirían código alguno. Es\n" +
            "más: el trabajo de administrar todos estos componentes y utilizarlos de manera óptima es una tarea\n" +
            "muy desafiante. Por esta razón, las computadoras están equipadas con una capa de software llamada sistema operativo, cuyo trabajo es proporcionar a los programas de usuario un modelo de computadora mejor, más simple y pulcro, así como encargarse de la administración de todos los recursos\n" +
            "antes mencionados. Los sistemas operativos son el tema de este libro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtV=findViewById(R.id.textView);
        txtV.setText(cade);

    }
}