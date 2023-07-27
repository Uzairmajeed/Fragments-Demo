package com.facebook.fragments_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity_M", "onCreate() activated");
        setContentView(R.layout.activity_main);
        // Set Fr1 as the initial fragment in the MainActivity layout
        if (savedInstanceState == null) {
            showFragment1();
        }
    }

    private void showFragment1() {
        Fr1 fragment1 = new Fr1();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment1);
        fragmentTransaction.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity_M", "onStart() activated");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity_M", "onResume() activated");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity_M", "onPause() activated");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity_M", "onStop() activated");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity_M", "onDestroy() activated");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity_M", "onRestart() activated");
    }
}
