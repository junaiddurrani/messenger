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

public class MessagesFragment extends Fragment {

    private View mView;
    private RecyclerView storyList, messagesList;
    private LinearLayoutManager storyManager, messagesManager;
    private List<StoryModel> list;
    private List<MessagesModel> list2;
    private StoryAdapter adapter;
    private MessagesAdapter adapter2;

    public MessagesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.fragment_messages, container, false);

        storyList = mView.findViewById(R.id.storyList);
        messagesList = mView.findViewById(R.id.messagesList);

        storyManager = new LinearLayoutManager(container.getContext());
        storyManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        storyManager.setSmoothScrollbarEnabled(true);

        messagesManager = new LinearLayoutManager(container.getContext());
        messagesManager.setOrientation(LinearLayoutManager.VERTICAL);
        messagesManager.setSmoothScrollbarEnabled(true);

        storyList.setLayoutManager(storyManager);
        messagesList.setLayoutManager(messagesManager);

        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.picture_1,"User 1"));
        list.add(new StoryModel(R.drawable.picture_2,"User 2"));
        list.add(new StoryModel(R.drawable.picture_3,"User 3"));
        list.add(new StoryModel(R.drawable.picture_4,"User 4"));
        list.add(new StoryModel(R.drawable.picture_5,"User 5"));
        list.add(new StoryModel(R.drawable.picture_6,"User 6"));
        list.add(new StoryModel(R.drawable.picture_7, "User 7"));
        list.add(new StoryModel(R.drawable.picture_8,"User 8"));
        list.add(new StoryModel(R.drawable.picture_9,"User 9"));
        list.add(new StoryModel(R.drawable.picture_10,"User 10"));
        list.add(new StoryModel(R.drawable.picture_11,"User 11"));

        adapter = new StoryAdapter(container.getContext(), list);

        storyList.setAdapter(adapter);

        list2 = new ArrayList<>();
        list2.add(new MessagesModel(R.drawable.picture_11, R.drawable.picture_4, "User 1", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_10, R.drawable.picture_9, "User 2", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_9, R.drawable.picture_3, "User 3", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_8, R.drawable.picture_6, "User 4", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_7, R.drawable.picture_8, "User 5", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_6, R.drawable.picture_5, "User 6", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_5, R.drawable.picture_7, "User 7", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_4, R.drawable.picture_10, "User 8", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_3, R.drawable.picture_11, "User 9", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_2, R.drawable.picture_1, "User 10", "07:30 PM", "Hi dear how are you"));
        list2.add(new MessagesModel(R.drawable.picture_1, R.drawable.picture_2, "User 11", "07:30 PM", "Hi dear how are you"));

        adapter2 = new MessagesAdapter(container.getContext(), list2);
        messagesList.setAdapter(adapter2);

        return mView;
    }

}
