package com.example.mtador12.sofrabeta3.Orders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerViewAdapterPrevios extends RecyclerView.Adapter<RecyclerViewAdapterPrevios.MyViewHolderPrevios> {

    Context previosOrdercontext;
    List<PreviosOrderData> previosOrderData;

    public RecyclerViewAdapterPrevios(Context previosOrdercontext, List<PreviosOrderData> previosOrderData) {
        this.previosOrdercontext = previosOrdercontext;
        this.previosOrderData = previosOrderData;
    }

    @NonNull
    @Override
    public MyViewHolderPrevios onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(previosOrdercontext).inflate(R.layout.row_previosorder,viewGroup,false);
        MyViewHolderPrevios myviewHolderExist = new MyViewHolderPrevios(v);

        return myviewHolderExist;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderPrevios myViewHolderPrevios, int position) {

       myViewHolderPrevios.foodName.setText(previosOrderData.get(position).getName());
       myViewHolderPrevios.foodImage.setImageResource(previosOrderData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return previosOrderData.size();
    }

    public static class MyViewHolderPrevios extends RecyclerView.ViewHolder{

        private TextView foodName;
        private ImageView foodImage;

        public MyViewHolderPrevios(@NonNull View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.previosordername_ID);
            foodImage = itemView.findViewById(R.id.previosorderimage_ID);
        }
    }
}
