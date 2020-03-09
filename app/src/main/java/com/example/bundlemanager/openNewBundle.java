package com.example.bundlemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class openNewBundle extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_new_bundle);

        Button craftsButton = findViewById(R.id.craftsRoom);
        Button pantryButton = findViewById(R.id.pantry);
        Button fishButton   = findViewById(R.id.fishTank);
        Button boilerButton = findViewById(R.id.boilerRoom);
        Button bbButton     = findViewById(R.id.bulletinBoard);
        Button vaultButton  = findViewById(R.id.vault);

        craftsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCraftsBundle();
            }
        });

        pantryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPantryBundle();
            }
        });

        fishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFishBundle();
            }
        });

        boilerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoilerBundle();
            }
        });

        bbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBulletinBundle();
            }
        });

        vaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVaultBundle();
            }
        });
    }

    public void openCraftsBundle() {
        Intent intent = new Intent(this, openCraftsBundle.class);
        startActivity(intent);
    }

    public void openPantryBundle() {
        Intent intent = new Intent(this, openPantryBundle.class);
        startActivity(intent);
    }

    public void openFishBundle() {
        Intent intent = new Intent(this, openFishBundle.class);
        startActivity(intent);
    }

    public void openBoilerBundle() {
        Intent intent = new Intent(this, openBoilerBundle.class);
        startActivity(intent);
    }

    public void openBulletinBundle() {
        Intent intent = new Intent(this, openBulletinBundle.class);
        startActivity(intent);
    }

    public void openVaultBundle() {
        Intent intent = new Intent(this, openVaultBundle.class);
        startActivity(intent);
    }
}
