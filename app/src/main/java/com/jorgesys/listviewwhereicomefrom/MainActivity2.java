package com.jorgesys.listviewwhereicomefrom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String descripcion = intent.getStringExtra("descripcion");

        TextView textView = (TextView)findViewById(R.id.text);
        textView.setText("Hello i´m " + nombre + "\n" + descripcion);




    }
}
