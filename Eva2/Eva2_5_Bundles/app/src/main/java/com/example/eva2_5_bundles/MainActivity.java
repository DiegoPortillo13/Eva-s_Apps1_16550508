package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] Cd={"Chihuahua","Parral","Delicias","Aldama","Juarez","Villa Ahuamda","Jimenez","Majalca","Atlantida","Tangamandapio","Aqui","Alla","PorAkulla"};
    ListView lstV;
    Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstV=findViewById(R.id.LstV);
        intento = new Intent(this, DetailActivity.class);
        lstV.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Cd));

        lstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putString("Ciudad", Cd[i]);
                bundle.putString("Posicion", String.valueOf(i));
                intento.putExtras(bundle);
                startActivity(intento);
            }
        });
    }
}