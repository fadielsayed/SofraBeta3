package com.example.mtador12.sofrabeta3.GivenOrders;

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

public class CurrentlyOrdersFragment extends Fragment {

    View v;

    public CurrentlyOrdersFragment() {
    }

    private RecyclerView myrecyclerView;
    private List<CurrentlyOrdersData> currentorderDataList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.currentlyorders_fragment,container,false);

        myrecyclerView = v.findViewById(R.id.currentttorderRecycler_ID);
        RecyclerAdapterCurrentlyOrders recyclerViewAdapterFoodMenu = new RecyclerAdapterCurrentlyOrders(getContext(),currentorderDataList);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapterFoodMenu);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        currentorderDataList = new ArrayList<>();
        currentorderDataList.add(new CurrentlyOrdersData("محمد المحمودي"));
        currentorderDataList.add(new CurrentlyOrdersData("محمد المحمودي"));
        currentorderDataList.add(new CurrentlyOrdersData("محمد المحمودي"));
    }
}
