package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openFallForaging extends AppCompatActivity {

    // Declare Variables to be used in later functions.
    private CheckBox commonMushroom;
    private CheckBox wildPlum;
    private CheckBox hazelnut;
    private CheckBox blackberry;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String MUSHROOM_PREF = "commonMushroom";
    public static final String WILDPLUM_PREF = "wildPlum";
    public static final String HAZELNUT_PREF = "hazelnut";
    public static final String BLACKBERRY_PREF = "blackberry";


    // Variables to store the state of the checkboxes in shared preferences
    private boolean mushroomCheck;
    private boolean wildPlumCheck;
    private boolean hazelnutCheck;
    private boolean blackberryCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_fall_foraging);

        commonMushroom = findViewById(R.id.mushroom);
        wildPlum = findViewById(R.id.wildplum);
        hazelnut = findViewById(R.id.hazelnut);
        blackberry = findViewById(R.id.blackberry);

        commonMushroom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (commonMushroom.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        wildPlum.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(wildPlum.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        hazelnut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(hazelnut.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        blackberry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(blackberry.isChecked())
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

        editor.putBoolean(MUSHROOM_PREF, commonMushroom.isChecked());
        editor.putBoolean(WILDPLUM_PREF, wildPlum.isChecked());
        editor.putBoolean(HAZELNUT_PREF, hazelnut.isChecked());
        editor.putBoolean(BLACKBERRY_PREF, blackberry.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        mushroomCheck = sharedPreferences.getBoolean(MUSHROOM_PREF, false);
        wildPlumCheck = sharedPreferences.getBoolean(WILDPLUM_PREF, false);
        hazelnutCheck = sharedPreferences.getBoolean(HAZELNUT_PREF, false);
        blackberryCheck = sharedPreferences.getBoolean(BLACKBERRY_PREF, false);

    }

    public void updateView() {
        commonMushroom.setChecked(mushroomCheck);
        wildPlum.setChecked(wildPlumCheck);
        hazelnut.setChecked(hazelnutCheck);
        blackberry.setChecked(blackberryCheck);

    }
}