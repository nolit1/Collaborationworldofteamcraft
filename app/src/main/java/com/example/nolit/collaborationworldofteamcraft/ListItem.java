package com.example.nolit.collaborationworldofteamcraft;

/**
 * Created by kj280 on 12.10.2017.
 */


//Здесь то, как выглядит один элемент главного списка
public class ListItem {

    private String mTitle;
    private String mAuthor;
    private String mPeopleCount;
    private String mCount;
    private int mImage;

    public ListItem(String title, String author, String peopleCount, String count, int image) {
        mTitle = title;
        mAuthor = author;
        mPeopleCount = peopleCount;
        mCount = count;
        mImage = image;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmPeopleCount() {
        return mPeopleCount;
    }

    public String getmCount() {
        return mCount;
    }

    public int getmImage() {
        return mImage;
    }

}
