package com.example.lukasznalbach.thebeglianfisingappv3;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_maten_zoetwater extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maten_zoetwater);

        //get list view object from xml
        ListView list = (ListView)findViewById(R.id.thelist);

        ArrayList<String> fishes = new ArrayList<String>();
       //add all the sweet water fishes to the array from the xml

      String[] visnamen = {
        //zoetwatervissen
              getString(R.string.aal), getString(R.string.aal_maat),
              getString(R.string.baars), getString(R.string.baars_maat),
              getString(R.string.beekforel), getString(R.string.beekforel_maat),
              getString(R.string.snoek), getString(R.string.snoek_maat),
              getString(R.string.snoekbaars), getString(R.string.snoekbaars_maat),
              getString(R.string.voorn), getString(R.string.voorn_maat),
              getString(R.string.zeelt), getString(R.string.zeelt_maat),

       };

       //fishes.add(getString(R.string.aal));

       for (int i = 0; i < visnamen.length; i++){
           fishes.add(visnamen[i]);
            //voeg alle ints toe aan de listview maar converteer deze eerst naar string
           //android java haalt alleen ints uit een xml file, het is makkelijker deze te converteren in een loop

       }




        //set in a foreach loop

        //until here
        ArrayAdapter fishesadapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, fishes); //adapter die de uiteindelijke items toevoegt aan de view

        list.setAdapter(fishesadapter);

    }

    public void back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }


}
