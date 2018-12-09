package com.android.messenger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GroupFragment extends Fragment {

    private View view;
    private RecyclerView groupList;
    private GridLayoutManager manager;
    private List<GroupModel> list;
    private GroupAdapter adapter;

    public GroupFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_group, container, false);

        groupList = view.findViewById(R.id.groupList);
        groupList.setHasFixedSize(true);
        manager = new GridLayoutManager(container.getContext(), 2);
        groupList.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(new GroupModel(R.drawable.picture_3, "Android Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_4, "Flutter Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_2, "React Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_8, "Web Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_5, "Android Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_1, "Flutter Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_11, "React Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_7, "Web Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));
        list.add(new GroupModel(R.drawable.picture_9, "Android Developer", "15 minutes ago", "Junaid, Jamshaid, Noshaid and +8"));

        adapter = new GroupAdapter(container.getContext(), list);
        groupList.setAdapter(adapter);

        return view;
    }

}
