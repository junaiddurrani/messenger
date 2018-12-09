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

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.ViewHolder> {

    private List<MessagesModel> list;
    private Context context;

    public MessagesAdapter(Context context, List<MessagesModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MessagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.messages_item_single_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessagesAdapter.ViewHolder viewHolder, int i) {
        MessagesModel model = list.get(i);
        viewHolder.imageView.setImageResource(model.getImage());
        viewHolder.imageView2.setImageResource(model.getImage2());
        viewHolder.name.setText(model.getName());
        viewHolder.message.setText(model.getMessage());
        viewHolder.time.setText(model.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View view;
        TextView name, time, message;
        CircleImageView imageView, imageView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name = view.findViewById(R.id.txtProfileName);
            time = view.findViewById(R.id.txtTime);
            message = view.findViewById(R.id.txtMessage);

            imageView = view.findViewById(R.id.profileImage);
            imageView2 = view.findViewById(R.id.readImage);
        }
    }
}
