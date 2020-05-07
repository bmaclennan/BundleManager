package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openExoticForaging extends AppCompatActivity {

    // Declare Variables to be used in later functions.
    private CheckBox coconut;
    private CheckBox cactusFruit;
    private CheckBox caveCarrot;
    private CheckBox redMushroom;
    private CheckBox purpleMushroom;
    private CheckBox mapleSyrup;
    private CheckBox oakResin;
    private CheckBox pineTar;
    private CheckBox morel;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String COCONUT_PREF = "coconut";
    public static final String CACTUSFRUIT_PREF = "cactusFruit";
    public static final String CAVECARROT_PREF = "caveCarrot";
    public static final String REDMUSHROOM_PREF = "redMushroom";
    public static final String PURPLEMUSHROOM_PREF = "purpleMushroom";
    public static final String MAPLESYRUP_PREF = "mapleSyrup";
    public static final String OAKRESIN_PREF = "oakResin";
    public static final String PINETAR_PREF = "pineTar";
    public static final String MOREL_PREF = "morel";


    // Variables to store the state of the checkboxes in shared preferences
    private boolean coconutCheck;
    private boolean cactusFruitCheck;
    private boolean caveCarrotCheck;
    private boolean redMushroomCheck;
    private boolean purpleMushroomCheck;
    private boolean mapleSyrupCheck;
    private boolean oakResinCheck;
    private boolean pineTarCheck;
    private boolean morelCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_exotic_foraging);

        coconut = findViewById(R.id.coconut);
        cactusFruit = findViewById(R.id.cactusFruit);
        caveCarrot = findViewById(R.id.caveCarrot);
        redMushroom = findViewById(R.id.redMushroom);
        purpleMushroom = findViewById(R.id.purpleMushroom);
        mapleSyrup = findViewById(R.id.mapleSyrup);
        oakResin = findViewById(R.id.oakResin);
        pineTar = findViewById(R.id.pineTar);
        morel = findViewById(R.id.morel);

        coconut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (coconut.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        cactusFruit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cactusFruit.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        caveCarrot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(caveCarrot.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        redMushroom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(redMushroom.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        purpleMushroom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(purpleMushroom.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        mapleSyrup.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(mapleSyrup.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        oakResin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(oakResin.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        pineTar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(pineTar.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        morel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(morel.isChecked())
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

        editor.putBoolean(COCONUT_PREF, coconut.isChecked());
        editor.putBoolean(CACTUSFRUIT_PREF, cactusFruit.isChecked());
        editor.putBoolean(CAVECARROT_PREF, caveCarrot.isChecked());
        editor.putBoolean(REDMUSHROOM_PREF, redMushroom.isChecked());
        editor.putBoolean(PURPLEMUSHROOM_PREF, purpleMushroom.isChecked());
        editor.putBoolean(MAPLESYRUP_PREF, mapleSyrup.isChecked());
        editor.putBoolean(OAKRESIN_PREF, oakResin.isChecked());
        editor.putBoolean(PINETAR_PREF, pineTar.isChecked());
        editor.putBoolean(MOREL_PREF, morel.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        coconutCheck = sharedPreferences.getBoolean(COCONUT_PREF, false);
        cactusFruitCheck = sharedPreferences.getBoolean(CACTUSFRUIT_PREF, false);
        caveCarrotCheck = sharedPreferences.getBoolean(CAVECARROT_PREF, false);
        redMushroomCheck = sharedPreferences.getBoolean(REDMUSHROOM_PREF, false);
        purpleMushroomCheck = sharedPreferences.getBoolean(PURPLEMUSHROOM_PREF, false);
        mapleSyrupCheck = sharedPreferences.getBoolean(MAPLESYRUP_PREF, false);
        oakResinCheck = sharedPreferences.getBoolean(OAKRESIN_PREF, false);
        pineTarCheck = sharedPreferences.getBoolean(PINETAR_PREF, false);
        morelCheck = sharedPreferences.getBoolean(MOREL_PREF, false);


    }

    public void updateView() {
        coconut.setChecked(coconutCheck);
        cactusFruit.setChecked(cactusFruitCheck);
        caveCarrot.setChecked(caveCarrotCheck);
        redMushroom.setChecked(redMushroomCheck);
        purpleMushroom.setChecked(purpleMushroomCheck);
        mapleSyrup.setChecked(mapleSyrupCheck);
        oakResin.setChecked(oakResinCheck);
        pineTar.setChecked(pineTarCheck);
        morel.setChecked(morelCheck);

    }
}
