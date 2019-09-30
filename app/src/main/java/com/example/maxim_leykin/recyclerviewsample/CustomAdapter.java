package com.example.maxim_leykin.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<String> mDataset;

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public MyViewHolder onCreateViewHolder (ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_view, parent, false);
        Log.d("Adapter", "OnCreateViewHolder");
        return new MyViewHolder(view);
    }

    public void onBindViewHolder(MyViewHolder vh, int position) {
        Log.d("Adapter", "OnBindViewHolder for position: " + position);
        vh.mTextView.setText(mDataset.get(position));
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CustomAdapter(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }
}
