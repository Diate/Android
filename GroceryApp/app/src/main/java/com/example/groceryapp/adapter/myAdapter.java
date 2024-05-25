package com.example.groceryapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.R;
import com.example.groceryapp.model.Item;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewholder> {
    private final List<Item> itemList;

    public myAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        Item item = itemList.get(position);
        holder.main_text.setText(item.getMain_title());
        holder.sub_text.setText(item.getSub_title());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{

        TextView main_text;
        TextView sub_text;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            main_text = itemView.findViewById(R.id.textView);
            sub_text = itemView.findViewById(R.id.subtext);
        }
    }
}
