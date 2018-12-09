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

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {

    private List<GroupModel> list;
    private Context context;

    public GroupAdapter(Context context, List<GroupModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public GroupAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.group_item_single_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroupAdapter.ViewHolder viewHolder, int i) {
        GroupModel model = list.get(i);
        viewHolder.imageView.setImageResource(model.getImage());
        viewHolder.name.setText(model.getName());
        viewHolder.time.setText(model.getTime());
        viewHolder.members.setText(model.getMember());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View view;
        CircleImageView imageView;
        TextView name, time, members;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name = view.findViewById(R.id.txtName);
            time = view.findViewById(R.id.txtTime);
            members = view.findViewById(R.id.txtMembers);

            imageView = view.findViewById(R.id.profileImage);
        }
    }
}
