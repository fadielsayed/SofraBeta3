package com.example.mtador12.sofrabeta3.OrderFood;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.mtador12.sofrabeta3.FoodMenu.FoodMenuActivity;
import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.OrderfoodViewHolder> {

    Context mcontext;
    List<Food> mData;

    public RecyclerviewAdapter(Context mcontext, List<Food> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public OrderfoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.row_orderfood,parent,false);
        OrderfoodViewHolder mviewHolder = new OrderfoodViewHolder(v);

        return mviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final OrderfoodViewHolder orderfoodViewHolder, int i) {

        orderfoodViewHolder.foodname.setText(mData.get(i).getName());
        orderfoodViewHolder.foodimage.setImageResource(mData.get(i).getPhoto());
        orderfoodViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext,FoodMenuActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class OrderfoodViewHolder extends RecyclerView.ViewHolder{

        private TextView foodname;
        private ImageView foodimage;
        private LinearLayout linearLayout;

        public OrderfoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodname = itemView.findViewById(R.id.foodname_ID);
            foodimage = itemView.findViewById(R.id.foodimage_ID);
            linearLayout = itemView.findViewById(R.id.MyitemFood);
        }


    }
}
