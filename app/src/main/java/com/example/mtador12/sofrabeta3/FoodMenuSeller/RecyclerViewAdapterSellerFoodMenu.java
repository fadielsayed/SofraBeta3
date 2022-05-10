package com.example.mtador12.sofrabeta3.FoodMenuSeller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerViewAdapterSellerFoodMenu extends RecyclerView.Adapter<RecyclerViewAdapterSellerFoodMenu.myViewHolderFoodMenu> {

    Context foodmenucontext;
    List<FoodMenuSellerData> foodMenuCustomerData;

    public RecyclerViewAdapterSellerFoodMenu(Context foodmenucontext, List<FoodMenuSellerData> foodMenuCustomerData) {
        this.foodmenucontext = foodmenucontext;
        this.foodMenuCustomerData = foodMenuCustomerData;
    }

    @NonNull
    @Override
    public myViewHolderFoodMenu onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v = LayoutInflater.from(foodmenucontext).inflate(R.layout.row_foodmenuseller,viewGroup,false);
        myViewHolderFoodMenu viewHolderFoodMenu = new myViewHolderFoodMenu(v);

        return viewHolderFoodMenu;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderFoodMenu myViewHolderFoodMenu, int position) {

        myViewHolderFoodMenu.foodName.setText(foodMenuCustomerData.get(position).getName());
        myViewHolderFoodMenu.foodPrice.setText(foodMenuCustomerData.get(position).getPrice());
        myViewHolderFoodMenu.foodImage.setImageResource(foodMenuCustomerData.get(position).getPhoto());
//        myViewHolderFoodMenu.relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(foodmenucontext,MenuFoodDetailsActivity.class);
//                v.getContext().startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return foodMenuCustomerData.size();
    }

    public static class myViewHolderFoodMenu extends RecyclerView.ViewHolder{

        private TextView foodName;
        private TextView foodPrice;
        private ImageView foodImage;
        private RelativeLayout relativeLayout;


        public myViewHolderFoodMenu(@NonNull View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.foodmenunameseller_ID);
            foodPrice = itemView.findViewById(R.id.pricefoodmenuSeller_ID);
            foodImage = itemView.findViewById(R.id.foodmenusellerimage_ID);
            relativeLayout = itemView.findViewById(R.id.myRelativeSeller_ID);

        }
    }
}
