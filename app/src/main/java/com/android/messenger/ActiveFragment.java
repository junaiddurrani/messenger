package com.android.messenger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ActiveFragment extends Fragment {

    private View view;
    private RecyclerView activeList;
    private LinearLayoutManager manager;
    private List<ActiveModel> list;
    private ActiveAdapter adapter;

    public ActiveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_active, container, false);

        activeList = view.findViewById(R.id.activeList);
        manager = new LinearLayoutManager(container.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        manager.setSmoothScrollbarEnabled(true);
        activeList.setHasFixedSize(true);
        activeList.setLayoutManager(manager);

        list = new ArrayList<>();

        list.add(new ActiveModel(R.drawable.picture_1, "User 1"));
        list.add(new ActiveModel(R.drawable.picture_2,  "User 2"));
        list.add(new ActiveModel(R.drawable.picture_3,  "User 3"));
        list.add(new ActiveModel(R.drawable.picture_4,  "User 4"));
        list.add(new ActiveModel(R.drawable.picture_5,  "User 5"));
        list.add(new ActiveModel(R.drawable.picture_6,  "User 6"));
        list.add(new ActiveModel(R.drawable.picture_7,  "User 7"));
        list.add(new ActiveModel(R.drawable.picture_8,  "User 8"));
        list.add(new ActiveModel(R.drawable.picture_9,  "User 9"));
        list.add(new ActiveModel(R.drawable.picture_10, "User 10"));
        list.add(new ActiveModel(R.drawable.picture_11, "User 11"));

        adapter = new ActiveAdapter(container.getContext(), list);
        activeList.setAdapter(adapter);

        return view;
    }

}
