package com.example.lukasznalbach.thebeglianfisingappv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMATEN = findViewById(R.id.buttonmaten);
        Button buttonKNOPEN = findViewById(R.id.buttonknopen);
        Button buttonWEER = findViewById(R.id.buttonweer);

        buttonMATEN.setOnClickListener(this);
        buttonKNOPEN.setOnClickListener(this);
        buttonWEER.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.buttonmaten:
                openActivity_MATEN();
                break;

            case R.id.buttonknopen:
                openActivity_KNOPEN();
                break;

            case R.id.buttonweer:
                openActivity_WEER();
                break;
        }
    }

    private void openActivity_MATEN()
    {
        Intent intentmaten = new Intent(this, Activity_maten.class);
        startActivity(intentmaten);
    }

    private void openActivity_KNOPEN()
    {
        Intent intentknopen = new Intent(this, Activity_knopen.class);
        startActivity(intentknopen);
    }

    private void openActivity_WEER()
    {
        Intent intentweer = new Intent(this, Activity_weer.class);
        startActivity(intentweer);
    }
}
