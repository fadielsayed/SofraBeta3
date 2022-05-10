package com.example.mtador12.sofrabeta3.OrdersBasket;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;
import com.example.mtador12.sofrabeta3.DetailsRequest.DetailsRequestActivity;

import java.util.List;

public class RecyclerAdapterOrderBasket extends RecyclerView.Adapter<RecyclerAdapterOrderBasket.OrderBasketViewHolder> {

    Context orderBasketContext;
    List<OrdersBasketData> ordersBasketData;

    public RecyclerAdapterOrderBasket(Context orderBasketContext, List<OrdersBasketData> ordersBasketData) {
        this.orderBasketContext = orderBasketContext;
        this.ordersBasketData = ordersBasketData;
    }

    @NonNull
    @Override
    public OrderBasketViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View v;
        v = LayoutInflater.from(orderBasketContext).inflate(R.layout.row_item_request_basket,viewGroup,false);
        OrderBasketViewHolder orderBasketViewHolder = new OrderBasketViewHolder(v);
        return orderBasketViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderBasketViewHolder orderBasketViewHolder, int position) {

        orderBasketViewHolder.name.setText(ordersBasketData.get(position).getName());
        orderBasketViewHolder.rowRequestBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(orderBasketContext,DetailsRequestActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ordersBasketData.size();
    }

    public static class OrderBasketViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private CardView rowRequestBasket;


        public OrderBasketViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.basketordername_ID);
            rowRequestBasket = itemView.findViewById(R.id.row_Requestitem_ID);
        }
    }
}
