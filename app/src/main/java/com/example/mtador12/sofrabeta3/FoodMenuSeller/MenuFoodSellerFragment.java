package com.example.mtador12.sofrabeta3.FoodMenuSeller;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mtador12.sofrabeta3.R;

import java.util.ArrayList;
import java.util.List;

public class MenuFoodSellerFragment extends Fragment {
    View v;

    private RecyclerView myrecyclerView;
    private List<FoodMenuSellerData> foodMenuCustomerDataList;

    public MenuFoodSellerFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.food_menufragmentseller,container,false);
        myrecyclerView = v.findViewById(R.id.foodmenufragSellerRecycler_ID);
        RecyclerViewAdapterSellerFoodMenu recyclerViewAdapterFoodMenu = new
                RecyclerViewAdapterSellerFoodMenu(getContext(), foodMenuCustomerDataList);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapterFoodMenu);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodMenuCustomerDataList = new ArrayList<>();
        foodMenuCustomerDataList.add(new FoodMenuSellerData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuCustomerDataList.add(new FoodMenuSellerData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuCustomerDataList.add(new FoodMenuSellerData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuCustomerDataList.add(new FoodMenuSellerData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuCustomerDataList.add(new FoodMenuSellerData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuCustomerDataList.add(new FoodMenuSellerData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuCustomerDataList.add(new FoodMenuSellerData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));


    }
}
