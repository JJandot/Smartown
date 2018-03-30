package com.example.julien.smartown;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Julien on 06/03/2018 for Smartown
 */

public class CommercesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO
        setContentView(R.layout.activity_commerces);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar_layout);

        ImageButton settings = findViewById(R.id.options);
        settings.setImageResource(R.drawable.ic_search_white_24dp);
    }

    public void settingsButton(View view) {
        Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
    }

    public void homeButton(View view) {
        finish();
    }
}
