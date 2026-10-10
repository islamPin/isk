package com.example.tty2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {
private TextView ttCar;
    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        ttCar=itemView.findViewById(R.id.car_tv);

    }
    public void bind(String car){
        ttCar.setText(car);
    }
}
