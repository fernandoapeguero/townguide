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

public class GalleryAdapter extends ArrayAdapter<InfoStorage> {

    public GalleryAdapter(@NonNull Activity context, ArrayList<InfoStorage> gallery) {
        super(context, 0, gallery);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.gallery_info,parent,false);
        }

        InfoStorage currentWord = getItem(position);

        TextView placesName = (TextView) listItemView.findViewById(R.id.header);

        if (currentWord != null) {
            placesName.setText(currentWord.getName());
        }

        TextView locations = (TextView) listItemView.findViewById(R.id.sub_header);

        if (currentWord != null) {
            locations.setText(currentWord.getLocation());
        }

        ImageView images = (ImageView) listItemView.findViewById(R.id.gallery_images);

        if (currentWord != null) {
            images.setImageResource(currentWord.getPicture());
        }

        TextView bodyText = (TextView) listItemView.findViewById(R.id.body_text);

        if (currentWord != null) {
            bodyText.setText(currentWord.getTextBody());
        }

        return listItemView;

    }
}
