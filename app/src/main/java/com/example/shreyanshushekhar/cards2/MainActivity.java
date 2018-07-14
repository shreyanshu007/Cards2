package com.example.shreyanshushekhar.cards2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView item_list;
    ArrayList<Cards> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item_list = (ListView) findViewById(R.id.item_list);

        item_list.setDivider(null);
        item_list.setDividerHeight(0);

        list = new ArrayList<Cards>();

        Cards card1 = new Cards("Dance", "Street Dance", "This will be free style dancing and for everyoneThis will be free style dancing and for everyoneThis will be free style dancing and for everyoneThis will be free style dancing and for everyone", "This is first button");
        Cards card2 = new Cards("Drama", "Stage", "This will be free style dancing and for everyoneThis will be free style dancing and for everyoneThis will be free style dancing and for everyoneThis will be free style dancing and for everyone", "This is second button");
        Cards card3 = new Cards("Music", "Solo", "This will be free style dancing and for everyoneThis will be free style dancing and for everyoneThis will be free style dancing and for everyoneThis will be free style dancing and for everyone", "This is third button");


        list.add(card1);
        list.add(card2);
        list.add(card3);

        CardAdapter adapter = new CardAdapter(this, list);


        item_list.setAdapter(adapter);



    }
}
