package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements controls.myListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void ButtonClicked(int action) {
        FragmentManager Fm =getSupportFragmentManager();
        animation Ani = (animation) Fm.findFragmentById(R.id.fragmentani);
        Ani.startAnimation(action);
    }
}