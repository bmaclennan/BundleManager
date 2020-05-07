package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class openWinterForaging extends AppCompatActivity {

    // Declare Variables to be used in later functions.
    private CheckBox winterRoot;
    private CheckBox crystalFruit;
    private CheckBox snowYam;
    private CheckBox crocus;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String WINTERROOT_PREF = "winterRoot";
    public static final String CRYSTALFRUIT_PREF = "crystalFruit";
    public static final String SNOWYAM_PREF = "snowYam";
    public static final String CROCUS_PREF = "crocus";


    // Variables to store the state of the checkboxes in shared preferences
    private boolean winterRootCheck;
    private boolean crystalFruitCheck;
    private boolean snowYamCheck;
    private boolean crocusCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_winter_foraging);

            winterRoot = findViewById(R.id.winterRoot);
            crystalFruit = findViewById(R.id.crystalFruit);
            snowYam = findViewById(R.id.snowYam);
            crocus = findViewById(R.id.crocus);

        winterRoot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (winterRoot.isChecked()) {
                        saveData();
                    }
                    else
                    {
                        saveData();
                    }
                }
            });

        crystalFruit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(crystalFruit.isChecked())
                    {
                        saveData();
                    }
                    else
                    {
                        saveData();
                    }
                }
            });

        snowYam.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(snowYam.isChecked())
                    {
                        saveData();
                    }
                    else
                    {
                        saveData();
                    }
                }
            });

        crocus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(crocus.isChecked())
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

            editor.putBoolean(WINTERROOT_PREF, winterRoot.isChecked());
            editor.putBoolean(CRYSTALFRUIT_PREF, crystalFruit.isChecked());
            editor.putBoolean(SNOWYAM_PREF, snowYam.isChecked());
            editor.putBoolean(CROCUS_PREF, crocus.isChecked());

            editor.apply();

        }

        public void loadData() {
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

            winterRootCheck = sharedPreferences.getBoolean(WINTERROOT_PREF, false);
            crystalFruitCheck = sharedPreferences.getBoolean(CRYSTALFRUIT_PREF, false);
            snowYamCheck = sharedPreferences.getBoolean(SNOWYAM_PREF, false);
            crocusCheck = sharedPreferences.getBoolean(CROCUS_PREF, false);

        }

        public void updateView() {
            winterRoot.setChecked(winterRootCheck);
            crystalFruit.setChecked(crystalFruitCheck);
            snowYam.setChecked(snowYamCheck);
            crocus.setChecked(crocusCheck);

        }
    }