package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openConstruction extends AppCompatActivity {

    // Declare Variables to be used in later functions.
    private CheckBox wood;
    private CheckBox wood2;
    private CheckBox stone;
    private CheckBox hardwood;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String WOOD_PREF = "wood";
    public static final String WOOD2_PREF = "wood2";
    public static final String STONE_PREF = "stone";
    public static final String HARDWOOD_PREF = "hardwood";


    // Variables to store the state of the checkboxes in shared preferences
    private boolean woodCheck;
    private boolean wood2Check;
    private boolean stoneCheck;
    private boolean hardwoodCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_construction);

        wood = findViewById(R.id.wood);
        wood2 = findViewById(R.id.wood2);
        stone = findViewById(R.id.stone);
        hardwood = findViewById(R.id.hardwood);

        wood.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (wood.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        wood2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(wood2.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        stone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(stone.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        hardwood.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(hardwood.isChecked())
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

        editor.putBoolean(WOOD_PREF, wood.isChecked());
        editor.putBoolean(WOOD2_PREF, wood2.isChecked());
        editor.putBoolean(STONE_PREF, stone.isChecked());
        editor.putBoolean(HARDWOOD_PREF, hardwood.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        woodCheck = sharedPreferences.getBoolean(WOOD_PREF, false);
        wood2Check = sharedPreferences.getBoolean(WOOD2_PREF, false);
        stoneCheck = sharedPreferences.getBoolean(STONE_PREF, false);
        hardwoodCheck = sharedPreferences.getBoolean(HARDWOOD_PREF, false);

    }

    public void updateView() {
        wood.setChecked(woodCheck);
        wood2.setChecked(wood2Check);
        stone.setChecked(stoneCheck);
        hardwood.setChecked(hardwoodCheck);

    }
}