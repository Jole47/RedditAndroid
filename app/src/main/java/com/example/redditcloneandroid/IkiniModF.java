package com.example.redditcloneandroid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import Adapters.BlokiranjeModeratora;

public class IkiniModF extends Fragment {

    RecyclerView recyclerViewPosts;
    String username[];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ukini_moderatora, container, false);

        recyclerViewPosts = view.findViewById(R.id.blockCardRecycler);

        username = getResources().getStringArray(R.array.username_post);

        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BlokiranjeModeratora adapter = new BlokiranjeModeratora(requireActivity(), username);
        recyclerViewPosts.setAdapter(adapter);
        recyclerViewPosts.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
    }


}