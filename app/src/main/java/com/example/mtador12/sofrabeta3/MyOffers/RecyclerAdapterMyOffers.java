package com.example.mtador12.sofrabeta3.MyOffers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerAdapterMyOffers extends RecyclerView.Adapter<RecyclerAdapterMyOffers.myViewHolderMyOffers> {

    Context myOfferscontext;
    List<MyOffersData> myOffersData;

    public RecyclerAdapterMyOffers(Context myOfferscontext, List<MyOffersData> myOffersData) {
        this.myOfferscontext = myOfferscontext;
        this.myOffersData = myOffersData;
    }

    @NonNull
    @Override
    public myViewHolderMyOffers onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;

        v = LayoutInflater.from(myOfferscontext).inflate(R.layout.row_myorders,viewGroup,false);
        myViewHolderMyOffers myViewHolderMyOffers = new myViewHolderMyOffers(v);
        return myViewHolderMyOffers;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderMyOffers myViewHolderMyOffers, int position) {

        myViewHolderMyOffers.name.setText(myOffersData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return myOffersData.size();
    }

    public static class myViewHolderMyOffers extends RecyclerView.ViewHolder{

        private TextView name;

        public myViewHolderMyOffers(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.product2_nameID);
        }
    }
}
