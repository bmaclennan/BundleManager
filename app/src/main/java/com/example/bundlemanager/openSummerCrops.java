package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openSummerCrops extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox tomato;
    private CheckBox hotPepper;
    private CheckBox blueberry;
    private CheckBox melon;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String TOMATO_PREF = "tomato";
    public static final String HOTPEPPER_PREF = "hotPepper";
    public static final String BLUEBERRY_PREF = "blueberry";
    public static final String MELON_PREF = "melon";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean tomatoCheck;
    private boolean hotPepperCheck;
    private boolean blueberryCheck;
    private boolean melonCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_summer_crops);

        tomato = findViewById(R.id.tomato);
        hotPepper = findViewById(R.id.hotPepper);
        blueberry = findViewById(R.id.blueberry);
        melon = findViewById(R.id.melon);

        tomato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (tomato.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        hotPepper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(hotPepper.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        blueberry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(blueberry.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        melon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(melon.isChecked())
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

        editor.putBoolean(TOMATO_PREF, tomato.isChecked());
        editor.putBoolean(HOTPEPPER_PREF, hotPepper.isChecked());
        editor.putBoolean(BLUEBERRY_PREF, blueberry.isChecked());
        editor.putBoolean(MELON_PREF, melon.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        tomatoCheck = sharedPreferences.getBoolean(TOMATO_PREF, false);
        hotPepperCheck = sharedPreferences.getBoolean(HOTPEPPER_PREF, false);
        blueberryCheck = sharedPreferences.getBoolean(BLUEBERRY_PREF, false);
        melonCheck = sharedPreferences.getBoolean(MELON_PREF, false);
    }

    public void updateView() {
        tomato.setChecked(tomatoCheck);
        hotPepper.setChecked(hotPepperCheck);
        blueberry.setChecked(blueberryCheck);
        melon.setChecked(melonCheck);
    }
}


