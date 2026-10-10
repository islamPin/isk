package com.example.tty2;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapters extends RecyclerView.Adapter<CarViewHolder> {
    private ArrayList<String> car;
    public CarAdapters(ArrayList<String> car) {
        this.car = car;
    }


    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_car,parent,false));


    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
holder.bind(car.get(position));
    }

    @Override
    public int getItemCount() {
        return car.size();
    }
}
