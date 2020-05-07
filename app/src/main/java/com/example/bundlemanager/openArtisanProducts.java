package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openArtisanProducts extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox truffleOil;
    private CheckBox cloth;
    private CheckBox goatCheese;
    private CheckBox cheese;
    private CheckBox honey;
    private CheckBox jelly;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String MILK_PREF = "truffleOil";
    public static final String BROWNEGG_PREF = "brownEgg";
    public static final String EGG_PREF = "egg";
    public static final String GMILK_PREF = "goatMilk";
    public static final String WOOL_PREF = "honey";
    public static final String DEGG_PREF = "jelly";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean truffleOilCheck;
    private boolean clothCheck;
    private boolean goatCheeseCheck;
    private boolean cheeseCheck;
    private boolean honeyCheck;
    private boolean jellyCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_artisan_products);

        truffleOil = findViewById(R.id.truffleOil);
        cloth = findViewById(R.id.cloth);
        goatCheese =  findViewById(R.id.goatCheese);
        cheese = findViewById(R.id.cheese);
        honey = findViewById(R.id.honey);
        jelly = findViewById(R.id.jelly);

        truffleOil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (truffleOil.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        cloth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cloth.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        goatCheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(goatCheese.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        cheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cheese.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        honey.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(honey.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        jelly.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(jelly.isChecked())
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

        editor.putBoolean(MILK_PREF, truffleOil.isChecked());
        editor.putBoolean(BROWNEGG_PREF, cloth.isChecked());
        editor.putBoolean(EGG_PREF, goatCheese.isChecked());
        editor.putBoolean(GMILK_PREF, cheese.isChecked());
        editor.putBoolean(WOOL_PREF, honey.isChecked());
        editor.putBoolean(DEGG_PREF, jelly.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        truffleOilCheck = sharedPreferences.getBoolean(MILK_PREF, false);
        clothCheck = sharedPreferences.getBoolean(BROWNEGG_PREF, false);
        goatCheeseCheck = sharedPreferences.getBoolean(EGG_PREF, false);
        cheeseCheck = sharedPreferences.getBoolean(GMILK_PREF, false);
        honeyCheck = sharedPreferences.getBoolean(WOOL_PREF, false);
        jellyCheck = sharedPreferences.getBoolean(DEGG_PREF, false);
    }

    public void updateView() {
        truffleOil.setChecked(truffleOilCheck);
        cloth.setChecked(clothCheck);
        goatCheese.setChecked(goatCheeseCheck);
        cheese.setChecked(cheeseCheck);
        honey.setChecked(honeyCheck);
        jelly.setChecked(jellyCheck);
    }
}