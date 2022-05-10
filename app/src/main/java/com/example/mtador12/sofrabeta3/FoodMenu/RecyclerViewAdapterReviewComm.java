package com.example.mtador12.sofrabeta3.FoodMenu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerViewAdapterReviewComm extends RecyclerView.Adapter<RecyclerViewAdapterReviewComm.myViewHolderReviewComm> {

    Context reviewContext;
    List<ReviewCommentData> reviewCommentData;

    public RecyclerViewAdapterReviewComm(Context reviewContext, List<ReviewCommentData> reviewCommentData) {
        this.reviewContext = reviewContext;
        this.reviewCommentData = reviewCommentData;
    }

    @NonNull
    @Override
    public myViewHolderReviewComm onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        View v;
        v = LayoutInflater.from(reviewContext).inflate(R.layout.row_reviewcomment,viewGroup,false);
        myViewHolderReviewComm myViewHolderReviewComm = new myViewHolderReviewComm(v);

        return myViewHolderReviewComm;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderReviewComm myViewHolderReviewComm, int position) {

        myViewHolderReviewComm.commentname.setText(reviewCommentData.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return reviewCommentData.size();
    }

    public static class myViewHolderReviewComm extends RecyclerView.ViewHolder {


        private TextView commentname;

        public myViewHolderReviewComm(@NonNull View itemView) {
            super(itemView);

            commentname = itemView.findViewById(R.id.commentname_ID);
        }
    }
}
