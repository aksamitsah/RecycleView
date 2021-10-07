package me.aksamitsah.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myviewHolder> {

    ArrayList<Model> data;

    public myAdapter(ArrayList<Model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.mini_view,parent,false);
        return new myviewHolder(view);
        //Goto On BindHolder
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        holder.textView.setText(data.get(position).getTitle());
        holder.img.setImageResource(data.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
