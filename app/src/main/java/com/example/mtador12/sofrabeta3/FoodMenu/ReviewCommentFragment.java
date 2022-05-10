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

public class ReviewCommentFragment extends Fragment {
    View v;

    private RecyclerView myrecyclerView;
    private List<ReviewCommentData> lstreviewCommentData;

    public ReviewCommentFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.comment_reviewfragment,container,false);
        myrecyclerView = v.findViewById(R.id.reviewcommentfragRecycler_ID);
        RecyclerViewAdapterReviewComm recyclerAdapterReview = new RecyclerViewAdapterReviewComm(getContext(),lstreviewCommentData);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerAdapterReview);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstreviewCommentData = new ArrayList<>();
        lstreviewCommentData.add(new ReviewCommentData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentData("خليل اليزيدي"));
        lstreviewCommentData.add(new ReviewCommentData("خليل اليزيدي"));


    }
}
