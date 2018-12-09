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

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.ViewHolder> {

    private List<CallModel> list;
    private Context context;

    public CallAdapter(Context context, List<CallModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CallAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.call_item_single_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdapter.ViewHolder viewHolder, int i) {
        CallModel model = list.get(i);
        viewHolder.imageView.setImageResource(model.getImage());
        viewHolder.name.setText(model.getName());
        viewHolder.time.setText(model.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View view;
        TextView name, time;
        CircleImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name = view.findViewById(R.id.txtName);
            time = view.findViewById(R.id.txtTime);
            imageView = view.findViewById(R.id.profileImage);
        }
    }
}
