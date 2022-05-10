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


public class RecyclerViewAdapterEXist extends RecyclerView.Adapter<RecyclerViewAdapterEXist.MyviewHolderExist> {

    Context existordercontext;
    List<ExistingorderData> existingorderData;

    public RecyclerViewAdapterEXist(Context existordercontext, List<ExistingorderData> existingorderData) {
        this.existordercontext = existordercontext;
        this.existingorderData = existingorderData;
    }

    @NonNull
    @Override
    public MyviewHolderExist onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(existordercontext).inflate(R.layout.row_exsistingorder,parent,false);
        MyviewHolderExist myviewHolderExist = new MyviewHolderExist(v);

        return myviewHolderExist;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolderExist myviewHolderExist, int position) {

        myviewHolderExist.foodName.setText(existingorderData.get(position).getName());
        myviewHolderExist.foodImage.setImageResource(existingorderData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return existingorderData.size();
    }

    public static class MyviewHolderExist extends RecyclerView.ViewHolder{

        private TextView foodName;
        private ImageView foodImage;

        public MyviewHolderExist(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.exsistingorderimage_ID);
            foodName = itemView.findViewById(R.id.exsistingordername_ID);
        }
    }
}
