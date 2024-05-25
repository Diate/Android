package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {

    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Planet> planetArrayList, Context context) {
        super(context, R.layout.item_list_layout,planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }
    private static class myViewHolder{
        ImageView planetImg;
        TextView planetName;
        TextView moonCount;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planets = getItem(position);
        myViewHolder viewHolder;
        final View result;
        if (convertView == null)
        {
            viewHolder = new myViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout,parent,false);


            viewHolder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            viewHolder.moonCount = (TextView) convertView.findViewById(R.id.number_moon);
            viewHolder.planetImg = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(viewHolder);
            result = convertView;

        }else {
            viewHolder = (myViewHolder) convertView.getTag();
            result = convertView;
        }

        assert planets != null;
        viewHolder.planetName.setText(planets.getPlanet_Name());
        viewHolder.moonCount.setText(planets.getMoon_Count());
        viewHolder.planetImg.setImageResource(planets.getPlanet_Image());

        return convertView;


    }
}
