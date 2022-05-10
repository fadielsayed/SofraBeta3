package com.example.mtador12.sofrabeta3.GivenOrders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerAdapterCurrentlyOrders extends RecyclerView.Adapter<RecyclerAdapterCurrentlyOrders.myViewHolderCurrentOrders> {

    Context currentordercontext;
    List<CurrentlyOrdersData> currentlyOrdersData;

    public RecyclerAdapterCurrentlyOrders(Context currentordercontext, List<CurrentlyOrdersData> currentlyOrdersData) {
        this.currentordercontext = currentordercontext;
        this.currentlyOrdersData = currentlyOrdersData;
    }

    @NonNull
    @Override
    public myViewHolderCurrentOrders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(currentordercontext).inflate(R.layout.row_fragment_currently_order,viewGroup,false);
        myViewHolderCurrentOrders myViewHolderCurrentOrders = new myViewHolderCurrentOrders(v);
        return myViewHolderCurrentOrders;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderCurrentOrders myViewHolderCurrentOrders, int position) {
        myViewHolderCurrentOrders.name.setText(currentlyOrdersData.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return currentlyOrdersData.size();
    }

    public static class myViewHolderCurrentOrders extends RecyclerView.ViewHolder{

        private TextView name;

        public myViewHolderCurrentOrders(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.clientName2_ID);
        }
    }
}
