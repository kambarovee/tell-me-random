package com.example.tellmerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class RandomizedCartoon1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomized_cartoon1);
        Button button = (Button) findViewById(R.id.againButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int number = rand.nextInt(3) + 1;
                Class activity = null;
                switch (number) {
                    case 1:
                        activity = RandomizedCartoon2.class;
                        break;
                    default:
                        activity = RandomizedCartoon3.class;
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
                Intent intent = new Intent(RandomizedCartoon1.this, Categories.class);
                startActivity(intent);
            }
        });
    }
}