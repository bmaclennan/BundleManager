package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openCrabPot extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox lobster;
    private CheckBox crayfish;
    private CheckBox crab;
    private CheckBox cockle;
    private CheckBox mussel;
    private CheckBox shrimp;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String LOBSTER_PREF = "lobster";
    public static final String CRAYFISH_PREF = "crayfish";
    public static final String CRAB_PREF = "crab";
    public static final String COCKLE_PREF = "cockle";
    public static final String MUSSEL_PREF = "mussel";
    public static final String SHRIMP_PREF = "shrimp";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean lobsterCheck;
    private boolean crayfishCheck;
    private boolean crabCheck;
    private boolean cockleCheck;
    private boolean musselCheck;
    private boolean shrimpCheck;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_crab_pot);

        lobster = findViewById(R.id.lobster);
        crayfish = findViewById(R.id.crayfish);
        crab =  findViewById(R.id.crab);
        cockle = findViewById(R.id.cockle);
        mussel = findViewById(R.id.mussel);
        shrimp = findViewById(R.id.shrimp);

        lobster.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (lobster.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        crayfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(crayfish.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        crab.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(crab.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        cockle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cockle.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        mussel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(mussel.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        shrimp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(shrimp.isChecked())
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

        editor.putBoolean(LOBSTER_PREF, lobster.isChecked());
        editor.putBoolean(CRAYFISH_PREF, crayfish.isChecked());
        editor.putBoolean(CRAB_PREF, crab.isChecked());
        editor.putBoolean(COCKLE_PREF, cockle.isChecked());
        editor.putBoolean(MUSSEL_PREF, mussel.isChecked());
        editor.putBoolean(SHRIMP_PREF, shrimp.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        lobsterCheck = sharedPreferences.getBoolean(LOBSTER_PREF, false);
        crayfishCheck = sharedPreferences.getBoolean(CRAYFISH_PREF, false);
        crabCheck = sharedPreferences.getBoolean(CRAB_PREF, false);
        cockleCheck = sharedPreferences.getBoolean(COCKLE_PREF, false);
        musselCheck = sharedPreferences.getBoolean(MUSSEL_PREF, false);
        shrimpCheck = sharedPreferences.getBoolean(SHRIMP_PREF, false);
    }

    public void updateView() {
        lobster.setChecked(lobsterCheck);
        crayfish.setChecked(crayfishCheck);
        crab.setChecked(crabCheck);
        cockle.setChecked(cockleCheck);
        mussel.setChecked(musselCheck);
        shrimp.setChecked(shrimpCheck);
    }
}