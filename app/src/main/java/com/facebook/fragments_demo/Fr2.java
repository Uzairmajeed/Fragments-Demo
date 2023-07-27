package com.facebook.fragments_demo;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fr2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fr2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View view;
    Button button;

    public Fr2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fr2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fr2 newInstance(String param1, String param2) {
        Fr2 fragment = new Fr2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("TAG2", "onAttach() activated");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG2", "onCreate() activated");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_fr2, container, false);
        Log.d("TAG2", "onCreateView() activated");
        button=view.findViewById(R.id.fr2btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToFragment3();
            }
        });
        return view;
    }
    private void navigateToFragment3() {
        Fr3 fragment3 = new Fr3();
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment3);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("TAG2", "onActivityCreated() activated");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG2", "onStart() activated");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG2", "onResume() activated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG2", "onPause() activated");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG2", "onStop() activated");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG2", "onDestroyView() activated");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG2", "onDestroy() activated");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TAG2", "onDetach() activated");
    }
}