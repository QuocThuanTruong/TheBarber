package com.qtt.thebarber.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.qtt.thebarber.Model.Banner;
import com.qtt.thebarber.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LookBookAdapter extends RecyclerView.Adapter<LookBookAdapter.LookBookViewHolder> {

    Context context;
    List<Banner> lookBookList;

    public LookBookAdapter(Context context, List<Banner> lookBookList) {
        this.context = context;
        this.lookBookList = lookBookList;
    }

    @NonNull
    @Override
    public LookBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_look_book, parent, false);
        return new LookBookViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LookBookViewHolder holder, int position) {
        Picasso.get().load(lookBookList.get(position).getImage()).into(holder.imgLookBook);
    }

    @Override
    public int getItemCount() {
        return lookBookList.size();
    }

    public class LookBookViewHolder extends RecyclerView.ViewHolder{
        ImageView imgLookBook;
        public LookBookViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLookBook = itemView.findViewById(R.id.img_look_book);
        }
    }
}
