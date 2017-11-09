package com.bgoyal.healthmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bittu_goyal on 11/8/17.
 */

public class GridAdapter extends BaseAdapter {

    List<String> titles;
    Context context;
    List<String> imageId;
    private static LayoutInflater inflater=null;


    public GridAdapter(Context context) {
        super();
        titles = new ArrayList<>();
        imageId = new ArrayList<>();
        this.context= context;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public void addItem(String title) {
        titles.add(title);
    }


    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return titles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.layout_grid_item, null);
        holder.tv=(TextView) rowView.findViewById(R.id.itemText);
        holder.img=(ImageView) rowView.findViewById(R.id.itemImage);

        holder.tv.setText(titles.get(position));
       // holder.img.setImageResource(imageId[position]);

        return rowView;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
        Button btn;
    }
}
