package com.example.lukasznalbach.thebeglianfisingappv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_weer extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weer);
        Button buttonZoet = findViewById(R.id.buttonzoetwaterW);
        Button buttonZout = findViewById(R.id.buttonzoutwaterW);

        buttonZoet.setOnClickListener(this);
        buttonZout.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.buttonzoetwaterW:
                openActivity_ZoetwaterW();
                break;

            case R.id.buttonzoutwaterW:
                openActivity_ZoutwaterW();
                break;
        }
    }

    private void openActivity_ZoetwaterW()
    {

    }

    private void openActivity_ZoutwaterW()
    {

    }
}
