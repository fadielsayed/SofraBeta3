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

public class RecyclerAdapterPriviosOrder extends RecyclerView.Adapter<RecyclerAdapterPriviosOrder.myViewHolderPriviosOrder> {

    Context priviosordercontext;
    List<PriviosOrdersData> priviosOrdersData;

    public RecyclerAdapterPriviosOrder(Context priviosordercontext, List<PriviosOrdersData> priviosOrdersData) {
        this.priviosordercontext = priviosordercontext;
        this.priviosOrdersData = priviosOrdersData;
    }

    @NonNull
    @Override
    public myViewHolderPriviosOrder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(priviosordercontext).inflate(R.layout.row_fragment_priviosorder,viewGroup,false);
        myViewHolderPriviosOrder myViewHolderPriviosOrder = new myViewHolderPriviosOrder(v);
        return myViewHolderPriviosOrder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderPriviosOrder myViewHolderPriviosOrder, int position) {
        myViewHolderPriviosOrder.name.setText(priviosOrdersData.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return priviosOrdersData.size();
    }

    public static class myViewHolderPriviosOrder extends RecyclerView.ViewHolder{

        private TextView name;

        public myViewHolderPriviosOrder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.clientName3_ID);
        }
    }
}
