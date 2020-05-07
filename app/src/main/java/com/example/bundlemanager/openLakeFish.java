package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openLakeFish extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox largeBass;
    private CheckBox carp;
    private CheckBox bullhead;
    private CheckBox sturgeon;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String LARGEBASS_PREF = "largeBass";
    public static final String CARP_PREF = "carp";
    public static final String BULLHEAD_PREF = "bullhead";
    public static final String STURGEON_PREF = "sturgeon";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean largeBassCheck;
    private boolean carpCheck;
    private boolean bullheadCheck;
    private boolean sturgeonCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_lake_fish);
        
        largeBass = findViewById(R.id.largeBass);
        carp = findViewById(R.id.carp);
        bullhead = findViewById(R.id.bullhead);
        sturgeon = findViewById(R.id.sturgeon);

        largeBass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (largeBass.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        carp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(carp.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        bullhead.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(bullhead.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        sturgeon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(sturgeon.isChecked())
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

        editor.putBoolean(LARGEBASS_PREF, largeBass.isChecked());
        editor.putBoolean(CARP_PREF, carp.isChecked());
        editor.putBoolean(BULLHEAD_PREF, bullhead.isChecked());
        editor.putBoolean(STURGEON_PREF, sturgeon.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        largeBassCheck = sharedPreferences.getBoolean(LARGEBASS_PREF, false);
        carpCheck = sharedPreferences.getBoolean(CARP_PREF, false);
        bullheadCheck = sharedPreferences.getBoolean(BULLHEAD_PREF, false);
        sturgeonCheck = sharedPreferences.getBoolean(STURGEON_PREF, false);
    }

    public void updateView() {
        largeBass.setChecked(largeBassCheck);
        carp.setChecked(carpCheck);
        bullhead.setChecked(bullheadCheck);
        sturgeon.setChecked(sturgeonCheck);
    }
}
