package com.example.lukasznalbach.thebeglianfisingappv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_maten extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maten);

        Button buttonZoet = findViewById(R.id.buttonzoetwater);
        Button buttonZout = findViewById(R.id.buttonzoutwater);

        buttonZoet.setOnClickListener(this);
        buttonZout.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.buttonzoetwater:
                openActivity_ZoetwaterMaten();
                break;

            case R.id.buttonzoutwater:
                openActivity_ZoutwaterMaten();
                break;
        }
    }

    private void openActivity_ZoetwaterMaten()
    {
        Intent intentmatenzoetwater = new Intent(this, Activity_maten_zoetwater.class);
        startActivity(intentmatenzoetwater);
    }

    private void openActivity_ZoutwaterMaten()
    {

    }

}
