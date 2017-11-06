package com.fernandoapeguero.townguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<InfoStorage> {


    public InfoAdapter(@NonNull Activity context, ArrayList<InfoStorage> infomation) {
        super(context, 0, infomation);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        InfoStorage currentWord = getItem(position);

        TextView placesName = (TextView) listItemView.findViewById(R.id.places_name);

        if (currentWord != null) {
            placesName.setText(currentWord.getName());
        }

        TextView locations = (TextView) listItemView.findViewById(R.id.places_location);

        if (currentWord != null) {
            locations.setText(currentWord.getLocation());
        }

        ImageView images = (ImageView) listItemView.findViewById(R.id.load_image);

        if (currentWord != null) {
            images.setImageResource(currentWord.getPicture());
        }

        return listItemView;
    }

}
