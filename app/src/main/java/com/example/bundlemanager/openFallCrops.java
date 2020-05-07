package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openFallCrops extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox corn;
    private CheckBox eggplant;
    private CheckBox pumpkin;
    private CheckBox yam;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String CORN_PREF = "corn";
    public static final String EGGPLANT_PREF = "eggplant";
    public static final String PUMPKIN_PREF = "pumpkin";
    public static final String YAM_PREF = "yam";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean cornCheck;
    private boolean eggplantCheck;
    private boolean pumpkinCheck;
    private boolean yamCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_fall_crops);

        corn = findViewById(R.id.corn);
        eggplant = findViewById(R.id.eggplant);
        pumpkin = findViewById(R.id.pumpkin);
        yam = findViewById(R.id.yam);

        corn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (corn.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        eggplant.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(eggplant.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        pumpkin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(pumpkin.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        yam.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(yam.isChecked())
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

        editor.putBoolean(CORN_PREF, corn.isChecked());
        editor.putBoolean(EGGPLANT_PREF, eggplant.isChecked());
        editor.putBoolean(PUMPKIN_PREF, pumpkin.isChecked());
        editor.putBoolean(YAM_PREF, yam.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        cornCheck = sharedPreferences.getBoolean(CORN_PREF, false);
        eggplantCheck = sharedPreferences.getBoolean(EGGPLANT_PREF, false);
        pumpkinCheck = sharedPreferences.getBoolean(PUMPKIN_PREF, false);
        yamCheck = sharedPreferences.getBoolean(YAM_PREF, false);
    }

    public void updateView() {
        corn.setChecked(cornCheck);
        eggplant.setChecked(eggplantCheck);
        pumpkin.setChecked(pumpkinCheck);
        yam.setChecked(yamCheck);
    }
}

