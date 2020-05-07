package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openRiverFish extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox sunfish;
    private CheckBox catfish;
    private CheckBox shad;
    private CheckBox tigerTrout;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String SUNFISH_PREF = "sunfish";
    public static final String CATFISH_PREF = "catfish";
    public static final String SHAD_PREF = "shad";
    public static final String TIGERTROUT_PREF = "tigerTrout";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean sunfishCheck;
    private boolean catfishCheck;
    private boolean shadCheck;
    private boolean tigerTroutCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_river_fish);


        sunfish = findViewById(R.id.sunfish);
        catfish = findViewById(R.id.catfish);
        shad = findViewById(R.id.shad);
        tigerTrout = findViewById(R.id.tigerTrout);

        sunfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sunfish.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        catfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(catfish.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        shad.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(shad.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        tigerTrout.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(tigerTrout.isChecked())
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

        editor.putBoolean(SUNFISH_PREF, sunfish.isChecked());
        editor.putBoolean(CATFISH_PREF, catfish.isChecked());
        editor.putBoolean(SHAD_PREF, shad.isChecked());
        editor.putBoolean(TIGERTROUT_PREF, tigerTrout.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        sunfishCheck = sharedPreferences.getBoolean(SUNFISH_PREF, false);
        catfishCheck = sharedPreferences.getBoolean(CATFISH_PREF, false);
        shadCheck = sharedPreferences.getBoolean(SHAD_PREF, false);
        tigerTroutCheck = sharedPreferences.getBoolean(TIGERTROUT_PREF, false);
    }

    public void updateView() {
        sunfish.setChecked(sunfishCheck);
        catfish.setChecked(catfishCheck);
        shad.setChecked(shadCheck);
        tigerTrout.setChecked(tigerTroutCheck);
    }
}