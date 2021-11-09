package com.example.pagerdialog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SliderFragment extends Fragment {

    int positionItem;

    public SliderFragment() {
        // Required empty public constructor
    }

    public static SliderFragment newInstance(int position, Integer item) {
        SliderFragment fragment = new SliderFragment();
        fragment.positionItem = position;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slider, container, false);
    }
}