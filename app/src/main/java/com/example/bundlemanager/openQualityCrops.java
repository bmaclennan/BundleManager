package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openQualityCrops extends AppCompatActivity {
    
    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox qualityParsnip;
    private CheckBox qualityMelon;
    private CheckBox qualityPumpkin;
    private CheckBox qualityCorn;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String QPARSNIP_PREF = "qualityParsnip";
    public static final String QMELON_PREF = "qualityMelon";
    public static final String QPUMPKIN_PREF = "qualityPumpkin";
    public static final String QCORN_PREF = "qualityCorn";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean qualityParsnipCheck;
    private boolean qualityMelonCheck;
    private boolean qualityPumpkinCheck;
    private boolean qualityCornCheck;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_quality_crops);


        qualityParsnip = findViewById(R.id.qualityParsnip);
        qualityMelon = findViewById(R.id.qualityMelon);
        qualityPumpkin = findViewById(R.id.qualityPumpkin);
        qualityCorn = findViewById(R.id.qualityCorn);

        qualityParsnip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (qualityParsnip.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        qualityMelon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(qualityMelon.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        qualityPumpkin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(qualityPumpkin.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        qualityCorn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(qualityCorn.isChecked())
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

        editor.putBoolean(QPARSNIP_PREF, qualityParsnip.isChecked());
        editor.putBoolean(QMELON_PREF, qualityMelon.isChecked());
        editor.putBoolean(QPUMPKIN_PREF, qualityPumpkin.isChecked());
        editor.putBoolean(QCORN_PREF, qualityCorn.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        qualityParsnipCheck = sharedPreferences.getBoolean(QPARSNIP_PREF, false);
        qualityMelonCheck = sharedPreferences.getBoolean(QMELON_PREF, false);
        qualityPumpkinCheck = sharedPreferences.getBoolean(QPUMPKIN_PREF, false);
        qualityCornCheck = sharedPreferences.getBoolean(QCORN_PREF, false);
    }

    public void updateView() {
        qualityParsnip.setChecked(qualityParsnipCheck);
        qualityMelon.setChecked(qualityMelonCheck);
        qualityPumpkin.setChecked(qualityPumpkinCheck);
        qualityCorn.setChecked(qualityCornCheck);
    }
}
