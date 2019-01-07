package com.example.lukasznalbach.thebeglianfisingappv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_knopen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knopen);



    }

    public void back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}
