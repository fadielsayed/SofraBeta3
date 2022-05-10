package com.example.mtador12.sofrabeta3.NewOffer;

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

public class RecyclerViewAdapterOffer extends RecyclerView.Adapter<RecyclerViewAdapterOffer.NewOfferViewHolder> {

   private Context newoffercontext;
   private List<NewOfferData> newOfferData;

    public RecyclerViewAdapterOffer(Context newoffercontext, List<NewOfferData> newOfferData) {
        this.newoffercontext = newoffercontext;
        this.newOfferData = newOfferData;
    }

    @NonNull
    @Override
    public NewOfferViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(newoffercontext).inflate(R.layout.row_newoffers,viewGroup,false);
        NewOfferViewHolder mviewHolder = new NewOfferViewHolder(v);
        return mviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewOfferViewHolder newOfferViewHolder, int position) {

        newOfferViewHolder.newOfferName.setText(newOfferData.get(position).getName());
        newOfferViewHolder.newofferImage.setImageResource(newOfferData.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return newOfferData.size();
    }

    public static class NewOfferViewHolder extends RecyclerView.ViewHolder{

        private TextView newOfferName;
        private ImageView newofferImage;

        public NewOfferViewHolder(@NonNull View itemView) {
            super(itemView);

            newOfferName = itemView.findViewById(R.id.newoffername_ID);
            newofferImage = itemView.findViewById(R.id.newofferimage_ID);
        }
    }
}
