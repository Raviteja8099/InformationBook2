package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import com.squareup.picasso.Callback;

public class IndiaFragment extends Fragment {



    public static IndiaFragment newInstance() {
        return new IndiaFragment();
    }
    public ImageView indiaImageView;
    public ProgressBar indiaProgressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_india, container, false);
       indiaImageView = view.findViewById(R.id.IndiaImageView);
       indiaProgressBar = view.findViewById(R.id.IndiaProgressBar);

        Picasso.get().load("https://images.unsplash.com/photo-1532375810709-75b1da00537c?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8aW5kaWF8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80")
                .into(indiaImageView, new Callback() {
                            @Override
                            public void onSuccess() {

                                indiaProgressBar.setVisibility(View.INVISIBLE);

                            }
                            @Override
                            public void onError(Exception e) {

                                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                                indiaProgressBar.setVisibility(View.INVISIBLE);
                            }
                        });

        return view;

    }
}