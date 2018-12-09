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

public class CallsFragment extends Fragment {

    private View view;
    private RecyclerView callList;
    private LinearLayoutManager manager;
    private List<CallModel> list;
    private CallAdapter adapter;

    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_calls, container, false);

        callList = view.findViewById(R.id.callList);
        callList.setHasFixedSize(true);
        manager = new LinearLayoutManager(container.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        callList.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(new CallModel(R.drawable.my_pic, "Junaid Durrani", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_3, "User 1", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_1, "User 2", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_4, "User 3", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_5, "User 4", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_8, "User 5", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_9, "User 6", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_2, "User 7", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_4, "User 8", "3 Nov"));
        list.add(new CallModel(R.drawable.picture_5, "User 9", "3 Nov"));

        adapter = new CallAdapter(container.getContext(), list);
        callList.setAdapter(adapter);

        return view;
    }

}
