package com.example.caculasquareadapter;

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
import java.util.List;
import java.util.zip.Inflater;

public class CustomAdapter extends ArrayAdapter<Shape> {

    ArrayList<Shape> shapes;
    Context context;

    public CustomAdapter(ArrayList<Shape> shapes, Context context) {
        super(context, R.layout.item_grid_layout,shapes);
        this.shapes = shapes;
        this.context = context;
    }

    private static class ViewHolder{
        ImageView imageView;
        TextView textView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Shape shape = getItem(position);

        ViewHolder viewHolder;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_grid_layout,parent,false);
            viewHolder.imageView = convertView.findViewById(R.id.shape);
            viewHolder.textView = convertView.findViewById(R.id.nameShape);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();

        }
        assert shape != null;
        viewHolder.textView.setText(shape.getName_shape());
        viewHolder.imageView.setImageResource(shape.getImg_shape());
        return  convertView;
    }
}
