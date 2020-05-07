package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openVaultBundle extends AppCompatActivity {

    // Declare Variables to be used in later functions.
    private CheckBox gold1;
    private CheckBox gold2;
    private CheckBox gold3;
    private CheckBox gold4;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String GOLD1_PREF = "gold1";
    public static final String GOLD2_PREF = "gold2";
    public static final String GOLD3_PREF = "gold3";
    public static final String GOLD4_PREF = "gold4";


    // Variables to store the state of the checkboxes in shared preferences
    private boolean gold1Check;
    private boolean gold2Check;
    private boolean gold3Check;
    private boolean gold4Check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_vault_bundle);


        gold1 = findViewById(R.id.gold1);
        gold2 = findViewById(R.id.gold2);
        gold3 = findViewById(R.id.gold3);
        gold4 = findViewById(R.id.gold4);

        gold1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (gold1.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        gold2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(gold2.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        gold3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(gold3.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        gold4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(gold4.isChecked())
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

        editor.putBoolean(GOLD1_PREF, gold1.isChecked());
        editor.putBoolean(GOLD2_PREF, gold2.isChecked());
        editor.putBoolean(GOLD3_PREF, gold3.isChecked());
        editor.putBoolean(GOLD4_PREF, gold4.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        gold1Check = sharedPreferences.getBoolean(GOLD1_PREF, false);
        gold2Check = sharedPreferences.getBoolean(GOLD2_PREF, false);
        gold3Check = sharedPreferences.getBoolean(GOLD3_PREF, false);
        gold4Check = sharedPreferences.getBoolean(GOLD4_PREF, false);

    }

    public void updateView() {
        gold1.setChecked(gold1Check);
        gold2.setChecked(gold2Check);
        gold3.setChecked(gold3Check);
        gold4.setChecked(gold4Check);

    }
}