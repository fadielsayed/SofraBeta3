package com.example.mtador12.sofrabeta3.Notify;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mtador12.sofrabeta3.R;

import java.util.List;

public class RecyclerViewAdapterNotify extends RecyclerView.Adapter<RecyclerViewAdapterNotify.NotifyViewHolder> {

    private Context notifycontext;
    private List<NotifyData> notifyData;

    public RecyclerViewAdapterNotify(Context notifycontext, List<NotifyData> notifyData) {
        this.notifycontext = notifycontext;
        this.notifyData = notifyData;
    }

    @NonNull
    @Override
    public NotifyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(notifycontext).inflate(R.layout.row_notify,viewGroup,false);
        NotifyViewHolder mviewHolder = new NotifyViewHolder(v);
        return mviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NotifyViewHolder notifyViewHolder, int position) {
        notifyViewHolder.notifyname.setText(notifyData.get(position).getName());
        notifyViewHolder.notifyImage.setImageResource(notifyData.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return notifyData.size() ;
    }

    public static class NotifyViewHolder extends RecyclerView.ViewHolder{


        private TextView notifyname;
        private ImageView notifyImage;

        public NotifyViewHolder(@NonNull View itemView) {
            super(itemView);

            notifyname = itemView.findViewById(R.id.notifyname_ID);
            notifyImage = itemView.findViewById(R.id.notifyimagee_ID);
        }
    }
}
