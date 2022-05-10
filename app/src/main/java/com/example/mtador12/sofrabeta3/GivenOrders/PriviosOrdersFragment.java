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

public class PriviosOrdersFragment extends Fragment {

    View v;

    public PriviosOrdersFragment() {
    }

    private RecyclerView myrecyclerView;
    private List<PriviosOrdersData> priviosorderDataList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.priviosorders_fragment,container,false);
        myrecyclerView = v.findViewById(R.id.priviosssorderRecycler_ID);
        RecyclerAdapterPriviosOrder recyclerViewAdapterFoodMenu = new RecyclerAdapterPriviosOrder(getContext(),priviosorderDataList);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapterFoodMenu);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        priviosorderDataList = new ArrayList<>();
        priviosorderDataList.add(new PriviosOrdersData("محمد المحمودي"));
        priviosorderDataList.add(new PriviosOrdersData("محمد المحمودي"));
    }
}
