package com.example.julien.smartown;

import android.Manifest;
import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String entry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.actionbar_layout);
        }
        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 0);
        }
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

    public void settingsButton(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }


    public void homeButton(View view) {}
}
