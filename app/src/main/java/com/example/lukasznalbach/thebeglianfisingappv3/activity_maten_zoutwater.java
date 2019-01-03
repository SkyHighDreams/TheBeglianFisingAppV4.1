package com.example.lukasznalbach.thebeglianfisingappv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_maten_zoutwater extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maten_zoutwater);

        ListView list = (ListView)findViewById(R.id.thelist);

        ArrayList<String> fishes = new ArrayList<String>();

        String[] visnamen = {getString(R.string.aal), getString(R.string.aal_maat),
                getString(R.string.ansjovis) ,getString(R.string.ansjovis_maat) ,
                getString(R.string.blauwe_leng) ,getString(R.string.blauwe_leng_maat) ,
                getString(R.string.bot) ,getString(R.string.bot_maat),
                getString(R.string.forel), getString(R.string.forel_maat),
                getString(R.string.haring), getString(R.string.haring_maat),
                getString(R.string.heek), getString(R.string.heek_maat),
                getString(R.string.horsmakreel), getString(R.string.horsmakreel_maat),
                getString(R.string.kabeljouw), getString(R.string.kabeljouw_maat),
                getString(R.string.leng), getString(R.string.leng_maat),
                getString(R.string.makreel), getString(R.string.makreel_maat),
                getString(R.string.sardine), getString(R.string.sardine_maat),
                getString(R.string.schar), getString(R.string.scharsizebe),
                getString(R.string.schelvis), getString(R.string.schol_maat),
                getString(R.string.tong), getString(R.string.tong_maat),
                getString(R.string.wijting), getString(R.string.wijting_maat),
                getString(R.string.witte_koolvis), getString(R.string.witte_koolvis_maat),
                getString(R.string.zalm), getString(R.string.zalm_maat),
                getString(R.string.zeebaars), getString(R.string.zeebaars_maat),
                getString(R.string.zeekreeft), getString(R.string.zeekreeft_maat),
                getString(R.string.zwarte_koolvis), getString(R.string.zwarte_koolvis_maat),
                //indien meer vissen moeten worden toegevoegd misschien best van de ui thread afhalen en in de achtergrond laten gebeuren


        };

        //fishes.add(getString(R.string.aal));

        for (int i = 0; i < visnamen.length; i++){
            fishes.add(visnamen[i]);
            //voeg alle ints toe aan de listview maar converteer deze eerst naar string
            //android java haalt alleen ints uit een xml file, het is makkelijker deze te converteren in een loop

        }

        ArrayAdapter fishesadapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, fishes); //adapter die de uiteindelijke items toevoegt aan de view

        list.setAdapter(fishesadapter);

    }


    public void back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}
