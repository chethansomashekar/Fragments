package com.example.chethan.fragments;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Chethan on 5/20/2017.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>  {
    private java.util.List<String> List;
    private Context context;

    private FragmentManager fragmentManager;

    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView Name;
        public ImageButton imageButton;

        public MyViewHolder(View view) {
            super(view);
            Name = (TextView) view.findViewById(R.id.Name);
            imageButton = (ImageButton) view.findViewById(R.id.check);


        }
    }


    public Adapter(List<String> List) {
        this.List = List;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String person = List.get(position);
        holder.Name.setText(person);
       holder.imageButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(context,Finshed.class);

               context.startActivity(intent);

           }
       });

    }

    @Override
    public int getItemCount() {
        return List.size();
    }
}
