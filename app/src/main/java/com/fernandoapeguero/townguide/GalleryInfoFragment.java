package com.fernandoapeguero.townguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryInfoFragment extends Fragment {

    public GalleryInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list,container,false);

        ArrayList<InfoStorage> places = new ArrayList<>();
        places.add(new InfoStorage("Central Park","New York, New York", R.drawable.central_park_full,getString(R.string.central_park_description)));
        places.add(new InfoStorage("Botanical Garden","Bronx, New York", R.drawable.botanical_garden_full, getString(R.string.botanical_garden)));
        places.add(new InfoStorage("Empanadas Monumental","New York, New York", R.drawable.empanadas_monumental_full,getString(R.string.empanadas_monumental)));
        places.add(new InfoStorage("Halal Deli" ,"Bronx, New York", R.drawable.halal_deli_full,getString(R.string.halal_deli_description) ));
        places.add(new InfoStorage("La Casa Del Mofongo","Manhattan New York", R.drawable.lacasadelmofongo_full,getString(R.string.lacasa_del_mofongo)));
        places.add(new InfoStorage("La Marina","Manhattan, New York", R.drawable.la_marina_full,getString(R.string.la_marina)));
        places.add(new InfoStorage("Turtle Cove Golf Center","Bronx, New York", R.drawable.turtle_cove_golf_full,getString(R.string.turtle_cove)));
        places.add(new InfoStorage("Ohana Japanese Hibachi","City Island, New York", R.drawable.ohana_japanese_full,getString(R.string.ohana_description)));
        places.add(new InfoStorage("Beso Lounge","Bronx, New York",R.drawable.besolounge_full,getString(R.string.beso_lounge)));

        GalleryAdapter itemsAdapter = new GalleryAdapter(getActivity(),places);

        final ListView galleryListView = (ListView) rootView.findViewById(R.id.list);

        galleryListView.setAdapter(itemsAdapter);

        return rootView;
    }



}
