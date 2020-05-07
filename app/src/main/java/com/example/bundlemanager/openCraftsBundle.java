package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class openCraftsBundle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_crafts_bundle);

        Button springButton = findViewById(R.id.spForaging);
        Button summerButton = findViewById(R.id.suForaging);
        Button fallButton = findViewById(R.id.faForaging);
        Button winterButton = findViewById(R.id.wiForaging);
        Button exoticButton = findViewById(R.id.exForaging);
        Button construction = findViewById(R.id.construction);


        springButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpringForaging();
            }
        });

        summerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSummerForaging();
            }
        });

        fallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFallForaging();
            }
        });

       winterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWinterForaging();
            }
        });

        exoticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExoticForaging();
            }
        });

        construction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConstruction();
            }
        });
    }

    public void openSpringForaging() {
        Intent intent = new Intent(this, openSpringForaging.class);
        startActivity(intent);
    }

    public void openSummerForaging() {
        Intent intent = new Intent(this, openSummerForaging.class);
        startActivity(intent);
    }

    public void openFallForaging() {
        Intent intent = new Intent(this, openFallForaging.class);
        startActivity(intent);
    }

    public void openWinterForaging() {
        Intent intent = new Intent(this, openWinterForaging.class);
        startActivity(intent);
    }

    public void openExoticForaging() {
        Intent intent = new Intent(this, openExoticForaging.class);
        startActivity(intent);
    }

    public void openConstruction() {
        Intent intent = new Intent(this, openConstruction.class);
        startActivity(intent);
    }
}
