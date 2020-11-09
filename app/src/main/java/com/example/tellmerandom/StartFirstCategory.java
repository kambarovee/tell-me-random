package com.example.tellmerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class StartFirstCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_first_category);
        Button button = (Button) findViewById(R.id.startRandomButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int number = rand.nextInt(5) + 1;
                Class activity = null;
                switch (number) {
                    case 1:
                        activity = RandomizedMovie1.class;
                        break;
                    case 2:
                        activity = RandomizedMovie2.class;
                        break;
                    case 3:
                        activity = RandomizedMovie3.class;
                        break;
                    case 4:
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
    }
}