package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
ITERATION #1 CONTAINS NO CODE CUSTOM CODE.

It was used to design the starting screen of the app and make
sure the custom images looked correct in the emulated Android
device. The goal for Iteration #2 will be continuing development
on the UI as well as aiming to create basic menu functionality
including the option to select and deselect options.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
