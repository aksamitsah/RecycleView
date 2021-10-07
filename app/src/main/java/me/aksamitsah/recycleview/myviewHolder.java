package me.aksamitsah.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView textView;

    public myviewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.img);
        textView = itemView.findViewById(R.id.text);

    }
}
