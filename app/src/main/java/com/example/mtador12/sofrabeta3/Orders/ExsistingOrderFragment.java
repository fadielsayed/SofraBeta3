package com.example.mtador12.sofrabeta3.Orders;

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

public class ExsistingOrderFragment extends Fragment {
    View v;
    private RecyclerView exisrecyclerView;
    private List<ExistingorderData> lstexistorder;

    public ExsistingOrderFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.exsistingorders_fragment,container,false);
        exisrecyclerView = v.findViewById(R.id.exsistingorderRecycler_ID);
        RecyclerViewAdapterEXist recyclerViewAdapterEXist = new RecyclerViewAdapterEXist(getContext(),lstexistorder);
        exisrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        exisrecyclerView.setAdapter(recyclerViewAdapterEXist);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstexistorder = new ArrayList<>();
        lstexistorder.add(new ExistingorderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstexistorder.add(new ExistingorderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstexistorder.add(new ExistingorderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstexistorder.add(new ExistingorderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstexistorder.add(new ExistingorderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstexistorder.add(new ExistingorderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));

    }
}
