package com.fernandoapeguero.townguide;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
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
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final Drawable drawable = getContext().getResources().getDrawable(R.drawable.pin,null);


        ArrayList<InfoStorage> places = new ArrayList<>();
        places.add(new InfoStorage("Central Park", "New York, New York", R.drawable.central_park));
        places.add(new InfoStorage("Botanical Garden", "Bronx, New York", R.drawable.botanicalgarden));
        places.add(new InfoStorage("Empanadas Monumental", "New York, New York", R.drawable.empanadasmonumental));
        places.add(new InfoStorage("Halal Deli", "Bronx, New York", R.drawable.halal_deli));
        places.add(new InfoStorage("La Casa Del Mofongo", "Manhattan New York", R.drawable.lacasadelmofongo));
        places.add(new InfoStorage("La Marina", "Manhattan, New York", R.drawable.lamarina));
        places.add(new InfoStorage("Turtle Cove Golf Center", "City Island, New York", R.drawable.turtlecovegolfcenter));
        places.add(new InfoStorage("Ohana Japanese Hibachi", "City Island", R.drawable.ohana));
        places.add(new InfoStorage("Beso Lounge", "Bronx, New York", R.drawable.besolounge));

        InfoAdapter itemsAdapter = new InfoAdapter(getActivity(), places);

        ListView placesListView = (ListView) rootView.findViewById(R.id.list);

        placesListView.setAdapter(itemsAdapter);

        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        Uri centralParkUri = Uri.parse("google.navigation:q=Central+Park,+NewYork+USA");
                        Intent centralparItent = new Intent(Intent.ACTION_VIEW, centralParkUri);
                        centralparItent.setPackage("com.google.android.apps.maps");
                        startActivity(centralparItent);
                        break;
                    case 1:
                        Uri botanicalUri = Uri.parse("google.navigation:q=Botanical+Garden,+Bronx+NewYork");
                        Intent BotanicalGItent = new Intent(Intent.ACTION_VIEW, botanicalUri);
                        BotanicalGItent.setPackage("com.google.android.apps.maps");
                        startActivity(BotanicalGItent);

                        break;
                    case 2:
                        Uri EmpanadasUri = Uri.parse("google.navigation:q=Empanadas+Monumental,+NewYork+NewYork");
                        Intent EmpanadasIntent = new Intent(Intent.ACTION_VIEW, EmpanadasUri);
                        EmpanadasIntent.setPackage("com.google.android.apps.maps");
                        startActivity(EmpanadasIntent);
                        break;
                    case 3:
                        Uri halalDeliUri = Uri.parse("google.navigation:q=Aks+Halal+deli,+Bronx+NewYork");
                        Intent halalDeliIntent = new Intent(Intent.ACTION_VIEW, halalDeliUri);
                        halalDeliIntent.setPackage("com.google.android.apps.maps");
                        startActivity(halalDeliIntent);

                        break;
                    case 4:
                        Uri mofongoHouseUri = Uri.parse("google.navigation:q=la+casa+del+mofongo,+NewYork+NewYork");
                        Intent mofongoHouseIntent = new Intent(Intent.ACTION_VIEW, mofongoHouseUri);
                        mofongoHouseIntent.setPackage("com.google.android.apps.maps");
                        startActivity(mofongoHouseIntent);
                        break;
                    case 5:
                        Uri laMarinaUri = Uri.parse("google.navigation:q=la+marina,+NewYork+NewYork");
                        Intent laMarinaIntent = new Intent(Intent.ACTION_VIEW, laMarinaUri);
                        laMarinaIntent.setPackage("com.google.android.apps.maps");
                        startActivity(laMarinaIntent);
                        break;
                    case 6:
                        Uri turtleCoveUri = Uri.parse("google.navigation:q=turtle+cove+golf+center,+City+Island+NewYork");
                        Intent turtleCoveIntent = new Intent(Intent.ACTION_VIEW, turtleCoveUri);
                        turtleCoveIntent.setPackage("com.google.android.apps.maps");
                        startActivity(turtleCoveIntent);
                        break;
                    case 7:
                        Uri ohanaUri = Uri.parse("google.navigation:q=ohana+japanese+hibachi+seafood,+City+Island+NewYork");
                        Intent ohanaIntent = new Intent(Intent.ACTION_VIEW, ohanaUri);
                        ohanaIntent.setPackage("com.google.android.apps.maps");
                        startActivity(ohanaIntent);
                        break;
                    case 8:
                        Uri besoLoungeUri = Uri.parse("google.navigation:q=+Beso+Lounge,+Bronx+NewYork");
                        Intent besoLoungeIntent = new Intent(Intent.ACTION_VIEW, besoLoungeUri);
                        besoLoungeIntent.setPackage("com.google.android.apps.maps");
                        startActivity(besoLoungeIntent);
                        break;
                    default:

                }
            }
        });
        return rootView;
    }



}
