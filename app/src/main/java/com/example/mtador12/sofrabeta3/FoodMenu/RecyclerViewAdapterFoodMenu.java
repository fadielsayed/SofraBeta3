package com.example.mtador12.sofrabeta3.FoodMenu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.MenuFoodDetails.MenuFoodDetailsActivity;
import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerViewAdapterFoodMenu extends RecyclerView.Adapter<RecyclerViewAdapterFoodMenu.myViewHolderFoodMenu> {

    Context foodmenucontext;
    List<FoodMenuData> foodMenuData;

    public RecyclerViewAdapterFoodMenu(Context foodmenucontext, List<FoodMenuData> foodMenuData) {
        this.foodmenucontext = foodmenucontext;
        this.foodMenuData = foodMenuData;
    }

    @NonNull
    @Override
    public myViewHolderFoodMenu onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v = LayoutInflater.from(foodmenucontext).inflate(R.layout.row_foodmenu,viewGroup,false);
        myViewHolderFoodMenu viewHolderFoodMenu = new myViewHolderFoodMenu(v);

        return viewHolderFoodMenu;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderFoodMenu myViewHolderFoodMenu, int position) {

        myViewHolderFoodMenu.foodName.setText(foodMenuData.get(position).getName());
        myViewHolderFoodMenu.foodPrice.setText(foodMenuData.get(position).getPrice());
        myViewHolderFoodMenu.foodImage.setImageResource(foodMenuData.get(position).getPhoto());
        myViewHolderFoodMenu.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(foodmenucontext,MenuFoodDetailsActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodMenuData.size();
    }

    public static class myViewHolderFoodMenu extends RecyclerView.ViewHolder{

        private TextView foodName;
        private TextView foodPrice;
        private ImageView foodImage;
        private RelativeLayout relativeLayout;


        public myViewHolderFoodMenu(@NonNull View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.foodmenuname_ID);
            foodPrice = itemView.findViewById(R.id.pricefoodmenu_ID);
            foodImage = itemView.findViewById(R.id.foodmenuimage_ID);
            relativeLayout = itemView.findViewById(R.id.myRelative_ID);

        }
    }
}
