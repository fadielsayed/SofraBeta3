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

public class ReviewCommentFragmentSeller extends Fragment {
    View v;

    private RecyclerView myrecyclerView;
    private List<ReviewCommentSellerData> lstreviewCommentData;

    public ReviewCommentFragmentSeller() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.comment_reviewfragmentseller,container,false);
        myrecyclerView = v.findViewById(R.id.reviewcommentSellerfragRecycler_ID);
        RecyclerViewAdapterReviewCommSeller recyclerAdapterReview = new RecyclerViewAdapterReviewCommSeller(getContext(),lstreviewCommentData);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerAdapterReview);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstreviewCommentData = new ArrayList<>();
        lstreviewCommentData.add(new ReviewCommentSellerData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentSellerData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentSellerData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentSellerData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentSellerData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentSellerData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentSellerData("خليل اليزيدي"));


    }
}
