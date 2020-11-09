package com.example.tellmerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class StartSecondCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_second_category);
        Button button = (Button) findViewById(R.id.startRandomButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int number = rand.nextInt(3) + 1;
                Class activity = null;
                switch (number) {
                    case 1:
                        activity = RandomizedAnime1.class;
                        break;
                    case 2:
                        activity = RandomizedAnime2.class;
                        break;
                    default:
                        activity = RandomizedAnime3.class;
                        break;
                }
                Intent intent = new Intent(getBaseContext(), activity);
                startActivity(intent);
            }
        });
    }
}