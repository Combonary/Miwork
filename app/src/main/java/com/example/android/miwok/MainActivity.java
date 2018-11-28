/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //make text views for all the different activities
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView family = (TextView)findViewById(R.id.family);
        TextView phrases = (TextView)findViewById(R.id.phrases);
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //make intents to open other activities from mainActivity
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent show = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(show);
                Toast.makeText(MainActivity.this, "I have arrived! in my true colors", Toast.LENGTH_SHORT).show();

            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent show = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(show);
                Toast.makeText(MainActivity.this, "I told you family", Toast.LENGTH_SHORT).show();
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent show = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(show);
                Toast.makeText(view.getContext(), "I'm beginning to get this", Toast.LENGTH_SHORT).show();
            }
        });
        numbers.setOnClickListener(new View.OnClickListener(){//set an onClickListener by overriding onClick method in an anonymous inner class
            @Override
            public void onClick(View view){//show this toast message
                Intent show = new Intent(MainActivity.this, NumbersActivity.class);//make an intent to open numbers activity
                startActivity(show);//start the intent
                Toast.makeText(view.getContext(), "Open the List of Numbers", Toast.LENGTH_SHORT).show();//show this toast as the screen is displayed
            }
        });


    }




/*
    public void openNumbersList(View v){
        Intent openNum = new Intent(this,NumbersActivity.class);
        startActivity(openNum);
    }
*/
}
