package com.example.myapplication;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] Dataset;
    public MyAdapter(String[] Dataset){
        this.Dataset=Dataset;
    }
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent ,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(Dataset[position]);
    }

    @Override
    public int getItemCount() {
        return Dataset.length;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public MyViewHolder(View viewType){
            super(viewType);
            this.textView=(TextView) viewType.findViewById(R.id.textView);
        }
    }
}
