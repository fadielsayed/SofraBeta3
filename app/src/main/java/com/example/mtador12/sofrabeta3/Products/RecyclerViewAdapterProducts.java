package com.example.mtador12.sofrabeta3.Products;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerViewAdapterProducts extends RecyclerView.Adapter<RecyclerViewAdapterProducts.productsViewHolder> {

    Context productcontext;
    List<ProductsData> productsData;

    public RecyclerViewAdapterProducts(Context productcontext, List<ProductsData> productsData) {
        this.productcontext = productcontext;
        this.productsData = productsData;
    }

    @NonNull
    @Override
    public productsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(productcontext).inflate(R.layout.row_productsitem,viewGroup,false);
        productsViewHolder productsViewHolder = new productsViewHolder(v);
        return productsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull productsViewHolder productsViewHolder, int position) {

        productsViewHolder.name.setText(productsData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return productsData.size();
    }

    public static class productsViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        public productsViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.product_nameID);
        }
    }
}
