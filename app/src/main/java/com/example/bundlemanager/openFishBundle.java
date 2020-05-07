package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class openFishBundle extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_fish_bundle);

        Button riverFish = findViewById(R.id.riverFish);
        Button lakeFish = findViewById(R.id.lakeFish);
        Button oceanFish = findViewById(R.id.oceanFish);
        Button nightFish = findViewById(R.id.nightFish);
        Button crabPot = findViewById(R.id.crabPot);
        Button specialFish = findViewById(R.id.specialFish);

        riverFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRiverFish();
            }
        });

        lakeFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLakeFish();
            }
        });

        oceanFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOceanFish();
            }
        });

       nightFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNightFish();
            }
        });

      crabPot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCrabPot();
            }
        });

           specialFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpecialFish();
            }
        });
    }

    public void openRiverFish() {
        Intent intent = new Intent(this, openRiverFish.class);
        startActivity(intent);
    }

    public void openLakeFish() {
        Intent intent = new Intent(this, openLakeFish.class);
        startActivity(intent);
    }

   public void openOceanFish() {
        Intent intent = new Intent(this, openOceanFish.class);
        startActivity(intent);
    }

  public void openNightFish() {
        Intent intent = new Intent(this, openNightFish.class);
        startActivity(intent);
    }

     public void openCrabPot() {
        Intent intent = new Intent(this, openCrabPot.class);
        startActivity(intent);
    }

      public void openSpecialFish() {
        Intent intent = new Intent(this, openSpecialFish.class);
        startActivity(intent);
    }
}
