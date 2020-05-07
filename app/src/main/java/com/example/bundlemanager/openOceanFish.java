package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openOceanFish extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox sardine;
    private CheckBox tuna;
    private CheckBox snapper;
    private CheckBox tilapia;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String SARDINE_PREF = "sardine";
    public static final String TUNA_PREF = "tuna";
    public static final String SNAPPER_PREF = "snapper";
    public static final String TILAPIA_PREF = "tilapia";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean sardineCheck;
    private boolean tunaCheck;
    private boolean snapperCheck;
    private boolean tilapiaCheck;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_ocean_fish);

        sardine = findViewById(R.id.sardine);
        tuna = findViewById(R.id.tuna);
        snapper = findViewById(R.id.snapper);
        tilapia = findViewById(R.id.tilapia);

        sardine.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sardine.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        tuna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(tuna.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        snapper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(snapper.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        tilapia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(tilapia.isChecked())
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

        editor.putBoolean(SARDINE_PREF, sardine.isChecked());
        editor.putBoolean(TUNA_PREF, tuna.isChecked());
        editor.putBoolean(SNAPPER_PREF, snapper.isChecked());
        editor.putBoolean(TILAPIA_PREF, tilapia.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        sardineCheck = sharedPreferences.getBoolean(SARDINE_PREF, false);
        tunaCheck = sharedPreferences.getBoolean(TUNA_PREF, false);
        snapperCheck = sharedPreferences.getBoolean(SNAPPER_PREF, false);
        tilapiaCheck = sharedPreferences.getBoolean(TILAPIA_PREF, false);
    }

    public void updateView() {
        sardine.setChecked(sardineCheck);
        tuna.setChecked(tunaCheck);
        snapper.setChecked(snapperCheck);
        tilapia.setChecked(tilapiaCheck);
    }
}
