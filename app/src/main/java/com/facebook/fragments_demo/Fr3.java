package com.facebook.fragments_demo;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fr3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fr3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fr3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fr3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fr3 newInstance(String param1, String param2) {
        Fr3 fragment = new Fr3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("TAG3", "onAttach() activated");
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG3", "onCreate() activated");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("TAG3", "onCreateView() activated");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fr3, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("TAG3", "onActivityCreated() activated");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG3", "onStart() activated");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG3", "onResume() activated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG3", "onPause() activated");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG3", "onStop() activated");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG3", "onDestroyView() activated");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG3", "onDestroy() activated");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TAG3", "onDetach() activated");
    }
}