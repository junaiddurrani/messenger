package com.android.messenger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ActiveAdapter extends RecyclerView.Adapter<ActiveAdapter.ViewHolder> {

    private List<ActiveModel> list;
    private Context context;

    public ActiveAdapter(Context context, List<ActiveModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ActiveAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.active_item_single_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActiveAdapter.ViewHolder viewHolder, int i) {
        ActiveModel model = list.get(i);
        viewHolder.imageView.setImageResource(model.getImage());
        viewHolder.textView.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View view;
        CircleImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            imageView = view.findViewById(R.id.profileImage);
            textView = view.findViewById(R.id.txtProfileName);
        }
    }
}
