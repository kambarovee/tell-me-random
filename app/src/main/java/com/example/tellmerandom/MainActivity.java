package com.example.tellmerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenu();
            }
        });
    }

    public void startMenu() {
        EditText editTxt = (EditText)findViewById(R.id.editText);
        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra("username", editTxt.getText().toString());
        startActivity(intent);
    }
}