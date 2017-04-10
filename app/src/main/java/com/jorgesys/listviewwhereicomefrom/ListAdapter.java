package com.jorgesys.listviewwhereicomefrom;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by jorgesys on 09/04/2017.
 */

 public class ListAdapter extends BaseAdapter {

        private ArrayList<myObjeto> entradas;
        private Context context;
        private int lastPosition;

        public ListAdapter(Context context, ArrayList<myObjeto> entradas) {
            this.context = context;
            this.entradas = entradas;
        }

        @Override
        public View getView(final int position, View convertView, final ViewGroup parent) {
            // inflate the layout.
            final ViewHolder mHolder;

            if (convertView == null) {
                convertView = LayoutInflater.from(context).
                        inflate(R.layout.item_row, parent, false);
                mHolder = new ViewHolder();
                mHolder.txtTitulo=(TextView) convertView.findViewById(R.id.titulo);
                mHolder.txtDescripcion=(TextView) convertView.findViewById(R.id.descripcion);
                mHolder.mImage=(ImageView) convertView.findViewById(R.id.androidImage);
                convertView.setTag(mHolder);


            }else{
                mHolder = (ViewHolder) convertView.getTag();
            }

            myObjeto item = entradas.get(position);
            mHolder.txtTitulo.setText(item.getTexto());


            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mHolder.txtDescripcion.setText("Usted salió de aquí!");

                    Intent intent = new Intent(context, MainActivity2.class);
                    intent.putExtra("nombre", entradas.get(position).getTexto());
                    intent.putExtra("descripcion", entradas.get(position).getDescripcion());
                    context.startActivity(intent);

                    notifyDataSetChanged();
                }
            });

            convertView.setTag(mHolder);
            return convertView;
            //return convertView;
        }

    @Override
    public int getCount() {
        return entradas.size();
    }

    @Override
    public Object getItem(int position) { return entradas.get(position); }

    @Override
    public long getItemId(int position) {
        return position;
    }


    private class ViewHolder {
        private TextView txtTitulo;
        private TextView txtDescripcion;
        private ImageView mImage;
    }
}
