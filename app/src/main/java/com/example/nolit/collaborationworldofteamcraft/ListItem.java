package com.example.nolit.collaborationworldofteamcraft;

/**
 * Created by kj280 on 12.10.2017.
 */


//Здесь то, как выглядит один элемент главного списка
public class ListItem {

    private String head;
   // private String imageUrl;

    public ListItem(String head, String imageUrl) {
        this.head = head;
       // this.imageUrl = imageUrl;
    }


    public String getHead() {
        return head;
    }

//    public String getImageUrl() {
//        return imageUrl;
//    }
}
