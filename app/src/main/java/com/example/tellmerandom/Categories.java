package com.example.tellmerandom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        CardView card1 = (CardView) findViewById(R.id.comedycategory);
        CardView card2 = (CardView) findViewById(R.id.animecategory);
        CardView card3 = (CardView) findViewById(R.id.cartooncategory);
        CardView card4 = (CardView) findViewById(R.id.biographycategory);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNext();
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callSecond();
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callThird();
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callForth();
            }
        });
    }

    public void callNext() {
        Intent intent = new Intent(this, StartFirstCategory.class);
        startActivity(intent);
    }

    public void callSecond() {
        Intent intent = new Intent(this, StartSecondCategory.class);
        startActivity(intent);
    }

    public void callThird() {
        Intent intent = new Intent(this, StartThirdCategory.class);
        startActivity(intent);
    }

    public void callForth() {
        Intent intent = new Intent(this, StartForthCategory.class);
        startActivity(intent);
    }
}