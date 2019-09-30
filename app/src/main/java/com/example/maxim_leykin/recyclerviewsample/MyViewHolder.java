package com.example.maxim_leykin.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextView;
    public MyViewHolder(View v) {
        super(v);
        mTextView = v.findViewById(R.id.text_item);
    }
}
