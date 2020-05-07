package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openAnimalProducts extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox largeMilk;
    private CheckBox largeBrownEgg;
    private CheckBox largeEgg;
    private CheckBox largeGoatMilk;
    private CheckBox wool;
    private CheckBox duckEgg;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String MILK_PREF = "largeMilk";
    public static final String BROWNEGG_PREF = "brownEgg";
    public static final String EGG_PREF = "egg";
    public static final String GMILK_PREF = "goatMilk";
    public static final String WOOL_PREF = "wool";
    public static final String DEGG_PREF = "duckEgg";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean largeMilkCheck;
    private boolean largeBrownEggCheck;
    private boolean largeEggCheck;
    private boolean largeGoatMilkCheck;
    private boolean woolCheck;
    private boolean duckEggCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_animal_products);

       largeMilk = findViewById(R.id.largeMilk);
       largeBrownEgg = findViewById(R.id.largeBrownEgg);
       largeEgg =  findViewById(R.id.largeEgg);
       largeGoatMilk = findViewById(R.id.largeGoatMilk);
       wool = findViewById(R.id.wool);
       duckEgg = findViewById(R.id.duckEgg);

        largeMilk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (largeMilk.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        largeBrownEgg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(largeBrownEgg.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        largeEgg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(largeEgg.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        largeGoatMilk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(largeGoatMilk.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        wool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(wool.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        duckEgg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(duckEgg.isChecked())
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

        editor.putBoolean(MILK_PREF, largeMilk.isChecked());
        editor.putBoolean(BROWNEGG_PREF, largeBrownEgg.isChecked());
        editor.putBoolean(EGG_PREF, largeEgg.isChecked());
        editor.putBoolean(GMILK_PREF, largeGoatMilk.isChecked());
        editor.putBoolean(WOOL_PREF, wool.isChecked());
        editor.putBoolean(DEGG_PREF, duckEgg.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        largeMilkCheck = sharedPreferences.getBoolean(MILK_PREF, false);
        largeBrownEggCheck = sharedPreferences.getBoolean(BROWNEGG_PREF, false);
        largeEggCheck = sharedPreferences.getBoolean(EGG_PREF, false);
        largeGoatMilkCheck = sharedPreferences.getBoolean(GMILK_PREF, false);
        woolCheck = sharedPreferences.getBoolean(WOOL_PREF, false);
        duckEggCheck = sharedPreferences.getBoolean(DEGG_PREF, false);
    }

    public void updateView() {
        largeMilk.setChecked(largeMilkCheck);
        largeBrownEgg.setChecked(largeBrownEggCheck);
        largeEgg.setChecked(largeEggCheck);
        largeGoatMilk.setChecked(largeGoatMilkCheck);
        wool.setChecked(woolCheck);
        duckEgg.setChecked(duckEggCheck);
    }
}
