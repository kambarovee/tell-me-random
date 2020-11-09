package com.example.tellmerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ListView listView = (ListView) findViewById(R.id.listView);
        TextView nameOfUsertxt = (TextView) findViewById(R.id.nameOfUser);

        Intent inten = getIntent();
        String str = inten.getStringExtra("username");
        nameOfUsertxt.setText(str);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.menu, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MenuActivity.this, Categories.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(MenuActivity.this, About.class);
                    startActivity(intent);
                }
            }
        };
        listView.setOnItemClickListener(itemClickListener);

    }
}