package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Word> space = new ArrayList<>();
    ListView mListView;
    //GridView mGridView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//open saved instance when user returns to this screen
        setContentView(R.layout.activity_numbers);//load this layout when this method is called

        //custom objects
        Word one = new Word("one", "otu",R.drawable.number_one);
        Word two = new Word("two", "abo",R.drawable.number_two);
        Word three = new Word("three", "ato",R.drawable.number_three);
        Word four = new Word("one", "ano", R.drawable.number_four);
        Word five = new Word("five", "ise", R.drawable.number_five);

        space.add(one);
        space.add(two);
        space.add(three);
        space.add(four);
        space.add(five);

        WordAdapter itemsAdapter = new WordAdapter(this, space);

        //view binding
        mListView = (ListView) findViewById(R.id.list_dynamic);
        //mGridView = (GridView)findViewById(R.id.grid_dynamic);

        mListView.setAdapter(itemsAdapter);
        //mGridView.setAdapter(itemsAdapter);


    }
}
