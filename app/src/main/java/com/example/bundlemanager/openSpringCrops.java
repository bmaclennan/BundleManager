package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class openSpringCrops extends AppCompatActivity {

    // Update for Iteration #5
    // Although there was no code update, the interface was redesigned to be image based versus text based.

    // Declare Variables to be used in later functions.
    private CheckBox parsnip;
    private CheckBox greenBean;
    private CheckBox cauliflower;
    private CheckBox potato;

    // Declare a name for shared preferences.
    public static final String SHARED_PREFS = "sharedPrefs";

    // Set shared preferences for variables in the activity
    public static final String PARSNIP_PREF = "parsnip";
    public static final String GREENBEAN_PREF = "greenBean";
    public static final String CAULIFLOWER_PREF = "cauliflower";
    public static final String POTATO_PREF = "potato";

    // Variables to store the state of the checkboxes in shared preferences
    private boolean parsnipCheck;
    private boolean greenBeanCheck;
    private boolean cauliflowerCheck;
    private boolean potatoCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_spring_crops);

        parsnip = findViewById(R.id.parsnip);
        greenBean = findViewById(R.id.greenBean);
        cauliflower = findViewById(R.id.cauliflower);
        potato = findViewById(R.id.potato);

        parsnip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (parsnip.isChecked()) {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        greenBean.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(greenBean.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        cauliflower.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cauliflower.isChecked())
                {
                    saveData();
                }
                else
                {
                    saveData();
                }
            }
        });

        potato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(potato.isChecked())
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

        editor.putBoolean(PARSNIP_PREF, parsnip.isChecked());
        editor.putBoolean(GREENBEAN_PREF, greenBean.isChecked());
        editor.putBoolean(CAULIFLOWER_PREF, cauliflower.isChecked());
        editor.putBoolean(POTATO_PREF, potato.isChecked());

        editor.apply();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        parsnipCheck = sharedPreferences.getBoolean(PARSNIP_PREF, false);
        greenBeanCheck = sharedPreferences.getBoolean(GREENBEAN_PREF, false);
        cauliflowerCheck = sharedPreferences.getBoolean(CAULIFLOWER_PREF, false);
        potatoCheck = sharedPreferences.getBoolean(POTATO_PREF, false);
    }

    public void updateView() {
        parsnip.setChecked(parsnipCheck);
        greenBean.setChecked(greenBeanCheck);
        cauliflower.setChecked(cauliflowerCheck);
        potato.setChecked(potatoCheck);
    }
}

