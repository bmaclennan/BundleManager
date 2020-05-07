package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class openPantryBundle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_pantry_bundle);

        Button springCrops = findViewById(R.id.spCrops);
        Button summerCrops = findViewById(R.id.suCrops);
        Button fallCrops = findViewById(R.id.faCrops);
        Button qualityCrops = findViewById(R.id.qualityCrops);
        Button animalProducts = findViewById(R.id.animal);
        Button artisanProducts = findViewById(R.id.artisan);

        springCrops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpringCrops();
            }
        });

        summerCrops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSummerCrops();
            }
        });

        fallCrops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFallCrops();
            }
        });

        qualityCrops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQualityCrops();
            }
        });

        animalProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnimalProducts();
            }
        });

        artisanProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArtisanProducts();
            }
        });
    }

    public void openSpringCrops() {
        Intent intent = new Intent(this, openSpringCrops.class);
        startActivity(intent);
    }

    public void openSummerCrops() {
        Intent intent = new Intent(this, openSummerCrops.class);
        startActivity(intent);
    }

    public void openFallCrops() {
        Intent intent = new Intent(this, openFallCrops.class);
        startActivity(intent);
    }

    public void openQualityCrops() {
        Intent intent = new Intent(this, openQualityCrops.class);
        startActivity(intent);
    }

    public void openAnimalProducts() {
        Intent intent = new Intent(this, openAnimalProducts.class);
        startActivity(intent);
    }

    public void openArtisanProducts() {
        Intent intent = new Intent(this, openArtisanProducts.class);
        startActivity(intent);
    }
}
