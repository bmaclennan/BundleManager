package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openSpringForaging extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox horseradish;
    private CheckBox daffodil;
    private CheckBox leek;
    private CheckBox dandelion;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String HORSERADISH_PREF = "horseradish";
    public static final String DAFFODIL_PREF = "daffodil";
    public static final String LEEK_PREF = "leek";
    public static final String DANDELION_PREF = "dandelion";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean horseradishCheck;
    private boolean daffodilCheck;
    private boolean leekCheck;
    private boolean dandelionCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_spring_foraging);

        horseradish = findViewById(R.id.horseradish);
        daffodil = findViewById(R.id.daffodil);
        leek = findViewById(R.id.leek);
        dandelion = findViewById(R.id.dandelion);

        horseradish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (horseradish.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        daffodil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(daffodil.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        leek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(leek.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        dandelion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(dandelion.isChecked())
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

            editor.putBoolean(HORSERADISH_PREF, horseradish.isChecked());
            editor.putBoolean(DAFFODIL_PREF, daffodil.isChecked());
            editor.putBoolean(LEEK_PREF, leek.isChecked());
            editor.putBoolean(DANDELION_PREF, dandelion.isChecked());

            editor.apply();

        }

        public void loadData() {
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

            horseradishCheck = sharedPreferences.getBoolean(HORSERADISH_PREF, false);
            daffodilCheck = sharedPreferences.getBoolean(DAFFODIL_PREF, false);
            leekCheck = sharedPreferences.getBoolean(LEEK_PREF, false);
            dandelionCheck = sharedPreferences.getBoolean(DANDELION_PREF, false);
        }

        public void updateView() {
            horseradish.setChecked(horseradishCheck);
            daffodil.setChecked(daffodilCheck);
            leek.setChecked(leekCheck);
            dandelion.setChecked(dandelionCheck);
        }
    }
