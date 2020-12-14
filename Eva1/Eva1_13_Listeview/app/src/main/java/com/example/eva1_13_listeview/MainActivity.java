package com.example.eva1_13_listeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] datos ={ "Montado", "Burrito", "Pizza", "Spaguetti", "Albondigas", "Hamburguesas", "Quesadilla", "Chile colorado", "Frijoles", "Picadillo",};
    ListView lV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lV=findViewById(R.id.ListD);

        lV.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos));
        lV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),datos[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}