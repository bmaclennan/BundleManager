package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class openSpecialFish extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox pufferfish;
    private CheckBox ghostfish;
    private CheckBox sandfish;
    private CheckBox woodskip;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String PUFFERFISH_PREF = "pufferfish";
    public static final String GHOSTFISH_PREF = "ghostfish";
    public static final String SANDFISH_PREF = "sandfish";
    public static final String WOODSKIP_PREF = "woodskip";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean pufferfishCheck;
    private boolean ghostfishCheck;
    private boolean sandfishCheck;
    private boolean woodskipCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_special_fish);

        pufferfish = findViewById(R.id.pufferfish);
        ghostfish = findViewById(R.id.ghostfish);
        sandfish = findViewById(R.id.sandfish);
        woodskip = findViewById(R.id.woodskip);

        pufferfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (pufferfish.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        ghostfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ghostfish.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        sandfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(sandfish.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        woodskip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(woodskip.isChecked())
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

        editor.putBoolean(PUFFERFISH_PREF, pufferfish.isChecked());
        editor.putBoolean(GHOSTFISH_PREF, ghostfish.isChecked());
        editor.putBoolean(SANDFISH_PREF, sandfish.isChecked());
        editor.putBoolean(WOODSKIP_PREF, woodskip.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        pufferfishCheck = sharedPreferences.getBoolean(PUFFERFISH_PREF, false);
        ghostfishCheck = sharedPreferences.getBoolean(GHOSTFISH_PREF, false);
        sandfishCheck = sharedPreferences.getBoolean(SANDFISH_PREF, false);
        woodskipCheck = sharedPreferences.getBoolean(WOODSKIP_PREF, false);
    }

    public void updateView() {
        pufferfish.setChecked(pufferfishCheck);
        ghostfish.setChecked(ghostfishCheck);
        sandfish.setChecked(sandfishCheck);
        woodskip.setChecked(woodskipCheck);
    }
}