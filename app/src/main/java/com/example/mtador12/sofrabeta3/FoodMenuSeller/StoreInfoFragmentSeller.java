package com.example.mtador12.sofrabeta3.FoodMenuSeller;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mtador12.sofrabeta3.R;

public class StoreInfoFragmentSeller extends Fragment {
    View v;

    public StoreInfoFragmentSeller() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.store_infofragmentseller,container,false);
        return v;
    }
}
