package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openNightFish extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox walleye;
    private CheckBox bream;
    private CheckBox eel;


    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String WALLEYE_PREF = "walleye";
    public static final String BREAM_PREF = "bream";
    public static final String EEL_PREF = "eel";


    // Variables to store the state of the checkboxes in shared preferences
    private boolean walleyeCheck;
    private boolean breamCheck;
    private boolean eelCheck;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_night_fish);

        walleye = findViewById(R.id.walleye);
        bream = findViewById(R.id.bream);
        eel = findViewById(R.id.eel);

        walleye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (walleye.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        bream.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(bream.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        eel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(eel.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });
        

        loadData();
        updateView();
    }
    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(WALLEYE_PREF, walleye.isChecked());
        editor.putBoolean(BREAM_PREF, bream.isChecked());
        editor.putBoolean(EEL_PREF, eel.isChecked());


        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        walleyeCheck = sharedPreferences.getBoolean(WALLEYE_PREF, false);
        breamCheck = sharedPreferences.getBoolean(BREAM_PREF, false);
        eelCheck = sharedPreferences.getBoolean(EEL_PREF, false);

    }

    public void updateView() {
        walleye.setChecked(walleyeCheck);
        bream.setChecked(breamCheck);
        eel.setChecked(eelCheck);

    }
}
