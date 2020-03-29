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

        springButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpringForaging();
            }
        });
    }

    public void openSpringForaging() {
        Intent intent = new Intent(this, openSpringForaging.class);
        startActivity(intent);
    }
}
