package com.example.mtador12.sofrabeta3.FoodMenu;

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

public class MenuFoodFragment extends Fragment {
    View v;

    private RecyclerView myrecyclerView;
    private List<FoodMenuData> foodMenuDataList;

    public MenuFoodFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.food_menufoodfragment,container,false);
        myrecyclerView = v.findViewById(R.id.foodmenufragRecycler_ID);
        RecyclerViewAdapterFoodMenu recyclerViewAdapterFoodMenu = new RecyclerViewAdapterFoodMenu(getContext(),foodMenuDataList);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapterFoodMenu);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodMenuDataList = new ArrayList<>();
        foodMenuDataList.add(new FoodMenuData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuDataList.add(new FoodMenuData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuDataList.add(new FoodMenuData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuDataList.add(new FoodMenuData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuDataList.add(new FoodMenuData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuDataList.add(new FoodMenuData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));
        foodMenuDataList.add(new FoodMenuData("ساندوتش برجر تركي","20ريال",R.drawable.sofraimage));


    }
}
