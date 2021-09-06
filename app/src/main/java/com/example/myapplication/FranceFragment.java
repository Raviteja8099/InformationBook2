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

public class FranceFragment extends Fragment {



    public static FranceFragment newInstance() {
        return new FranceFragment();
    }
    public ImageView franceImageView;
    public ProgressBar franceProgressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_india, container, false);
        franceImageView = view.findViewById(R.id.FranceImageView);
        franceProgressBar = view.findViewById(R.id.FranceProgressBar);

        Picasso.get().load("https://images.unsplash.com/photo-1532375810709-75b1da00537c?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8aW5kaWF8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80")
                .into(franceImageView, new Callback() {
                    @Override
                    public void onSuccess() {

                        franceProgressBar.setVisibility(View.INVISIBLE);

                    }
                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        franceProgressBar.setVisibility(View.INVISIBLE);
                    }
                });

        return view;

    }
}