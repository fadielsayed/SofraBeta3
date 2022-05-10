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

public class RecyclerAdapterNewOrders extends RecyclerView.Adapter<RecyclerAdapterNewOrders.myViewHolderNewOrders> {

    Context newordercontext;
    List<NewOrdersData> newOrdersData;

    public RecyclerAdapterNewOrders(Context newordercontext, List<NewOrdersData> newOrdersData) {
        this.newordercontext = newordercontext;
        this.newOrdersData = newOrdersData;
    }

    @NonNull
    @Override
    public myViewHolderNewOrders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v = LayoutInflater.from(newordercontext).inflate(R.layout.row_fragmentnew_order,viewGroup,false);
        myViewHolderNewOrders myViewHolderNewOrders = new myViewHolderNewOrders(v);
        return myViewHolderNewOrders;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderNewOrders myViewHolderNewOrders, int position) {
        myViewHolderNewOrders.name.setText(newOrdersData.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return newOrdersData.size();
    }

    public static class myViewHolderNewOrders extends RecyclerView.ViewHolder{

        private TextView name;

        public myViewHolderNewOrders(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(   R.id.clientName_ID);
        }
    }
}
