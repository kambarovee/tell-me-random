package com.example.tellmerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class RandomizedMovie1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomized_movie1);
        Button button = (Button) findViewById(R.id.againButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int number = rand.nextInt(4) + 1;
                Class activity = null;
                switch (number) {
                    case 1:
                        activity = RandomizedMovie2.class;
                        break;
                    case 2:
                        activity = RandomizedMovie3.class;
                        break;
                    case 3:
                        activity = RandomizedMovie4.class;
                        break;
                    default:
                        activity = RandomizedMovie5.class;
                        break;
                }
                Intent intent = new Intent(getBaseContext(), activity);
                startActivity(intent);
            }
        });
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RandomizedMovie1.this, Categories.class);
                startActivity(intent);
            }
        });
    }
}