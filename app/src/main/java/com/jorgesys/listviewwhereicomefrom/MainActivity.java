package com.jorgesys.listviewwhereicomefrom;

import android.content.Intent;
import android.media.Image;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private ListAdapter adapter;
    private int lastMarkedPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        /* Populate the ListView */
        final ArrayList<myObjeto> datos  = new ArrayList<>();
        datos.add(new myObjeto("1", "BUHO", "Búho es el nombre"));
        datos.add(new myObjeto("2", "COLIBRÍ", "Los troquilinos"));
        datos.add(new myObjeto("3", "PORC", "Los ratones locos"));
        datos.add(new myObjeto("4", "BROASCA", "BROASCA es el nombre"));
        datos.add(new myObjeto("5", "LEOAICA", "Los troquilinos"));
        datos.add(new myObjeto("6", "SORICEL", "Los ratones locos"));
        datos.add(new myObjeto("7", "PANTERA", "Búho es el nombre"));
        datos.add(new myObjeto("8", "PUMA", "Los troquilinos"));
        datos.add(new myObjeto("9", "CABALLO", "Los ratones locos"));
        datos.add(new myObjeto("10", "JIRAFA", "Búho es el nombre"));
        datos.add(new myObjeto("11", "CUINE", "Los troquilinos"));
        datos.add(new myObjeto("12", "PASARICA", "Los ratones locos"));
        datos.add(new myObjeto("12.5", "CERDO", "Búho es el nombre"));
        datos.add(new myObjeto("14", "VEVERITA", "Los troquilinos"));
        datos.add(new myObjeto("15", "FOX", "Los ratones locos"));


        adapter = new ListAdapter(this, datos);
        listView.setAdapter(adapter);
      /*  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("nombre", datos.get(position).getTexto());
                intent.putExtra("descripcion", datos.get(position).getDescripcion());
                startActivity(intent);

                //listView.setAdapter(adapter);
                //adapter.notifyDataSetChanged();

               // ((TextView)parent.getItemAtPosition(lastMarkedPosition)).setText("");
               //  ((TextView)(view.findViewById(R.id.descripcion))).setText("Usted salió de aquí!");


                lastMarkedPosition = position;
            }
        });*/

    }




}
