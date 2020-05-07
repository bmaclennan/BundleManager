package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openSummerForaging extends AppCompatActivity {

    // Declare Variables to be used in later functions.
    private CheckBox grape;
    private CheckBox spiceBerry;
    private CheckBox sweetPea;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String GRAPE_PREF = "grape";
    public static final String SPICEBERRY_PREF = "spiceBerry";
    public static final String SWEETPEA_PREF = "sweetPea";


    // Variables to store the state of the checkboxes in shared preferences
    private boolean grapeCheck;
    private boolean spiceBerryCheck;
    private boolean sweetPeaCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_summer_foraging);

        grape = findViewById(R.id.grape);
        spiceBerry = findViewById(R.id.spiceBerry);
        sweetPea = findViewById(R.id.sweetPea);

        grape.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (grape.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        spiceBerry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(spiceBerry.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        sweetPea.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(sweetPea.isChecked())
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

        editor.putBoolean(GRAPE_PREF, grape.isChecked());
        editor.putBoolean(SPICEBERRY_PREF, spiceBerry.isChecked());
        editor.putBoolean(SWEETPEA_PREF, sweetPea.isChecked());


        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        grapeCheck = sharedPreferences.getBoolean(GRAPE_PREF, false);
        spiceBerryCheck = sharedPreferences.getBoolean(SPICEBERRY_PREF, false);
        sweetPeaCheck = sharedPreferences.getBoolean(SWEETPEA_PREF, false);

    }

    public void updateView() {
        grape.setChecked(grapeCheck);
        spiceBerry.setChecked(spiceBerryCheck);
        sweetPea.setChecked(sweetPeaCheck);

    }
}