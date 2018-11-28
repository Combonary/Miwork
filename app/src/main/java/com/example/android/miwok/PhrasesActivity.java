package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    ListView show;
    ArrayList<Word> space = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        show = (ListView) findViewById(R.id.list_dynamic);

        //custom objects
        Word one = new Word("one", "otu");
        Word two = new Word("two", "abo");
        Word three = new Word("three", "ato");
        Word four = new Word("one", "ano");
        Word five = new Word("five", "ise");

        space.add(one);
        space.add(two);
        space.add(three);
        space.add(four);
        space.add(five);

        WordAdapter itemsAdapter = new WordAdapter(this, space);



        show.setAdapter(itemsAdapter);

    }
}
