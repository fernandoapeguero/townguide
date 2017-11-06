package com.fernandoapeguero.townguide;

public class InfoStorage {

    private String mName;
    private String mLocation;
    private int mPicture ;
    private String mTextBody;

    public InfoStorage(String name, String location, int picture ){

        mName = name;
        mLocation = location;
        mPicture = picture;
    }
    public InfoStorage(String name, String location, int picture, String textBody ){

        mName = name;
        mLocation = location;
        mPicture = picture;
        mTextBody = textBody;
    }


    public String getName(){

        return mName;
    }

    public String getLocation() {

        return mLocation;
    }

    public int getPicture(){

        return mPicture;
    }

    public String getTextBody(){
        return mTextBody;
    }
}
