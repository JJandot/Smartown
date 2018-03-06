package com.example.julien.smartown;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar_layout);
    }

    public void launchActu(View view) {
        Intent intent = new Intent(MainActivity.this, ActuActivity.class);
        startActivity(intent);
    }

    public void launchCommerce(View view) {
        Intent intent = new Intent(MainActivity.this, CommercesActivity.class);
        startActivity(intent);
    }

    public void launchReseau(View view) {
        Intent intent = new Intent(MainActivity.this, ReseauxActivity.class);
        startActivity(intent);
    }

    public void launchInterets(View view) {
        Intent intent = new Intent(MainActivity.this, InteretsActivity.class);
        startActivity(intent);
    }
}
