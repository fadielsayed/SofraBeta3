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

public class previosOrderFragment extends Fragment {

    View v;
    private RecyclerView previosrecyclerView;
    private List<PreviosOrderData> lstpreviosorders;
    public previosOrderFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.previosorder_fragment,container,false);
        previosrecyclerView = v.findViewById(R.id.previosorderRecycler_ID);
        RecyclerViewAdapterPrevios recyclerViewAdapterPrevios = new RecyclerViewAdapterPrevios(getContext(),lstpreviosorders);
        previosrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        previosrecyclerView.setAdapter(recyclerViewAdapterPrevios);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstpreviosorders = new ArrayList<>();
        lstpreviosorders.add(new PreviosOrderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstpreviosorders.add(new PreviosOrderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstpreviosorders.add(new PreviosOrderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstpreviosorders.add(new PreviosOrderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstpreviosorders.add(new PreviosOrderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstpreviosorders.add(new PreviosOrderData("تاج الفطيره الدمشقيه",R.drawable.sofraimage));

    }
}
