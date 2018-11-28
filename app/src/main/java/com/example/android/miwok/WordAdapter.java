package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * my custom adapter class to show Igbo to English translations
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the english word
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.eng_textView);

        // Get the english word from the current Word object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getEnglish());

        // Find the TextView in the list_item.xml layout with the igbo word
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.mi_textView);

        // Get the version number from the current Word object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getIgbo());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Word object and
        // set the image to iconView
        if(currentWord.hasImage()){
            iconView.setImageResource(currentWord.getRes());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
