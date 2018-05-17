package com.example.nolit.collaborationworldofteamcraft;

/**
 * Created by kj280 on 12.10.2017.
 */


//Здесь то, как выглядит один элемент главного списка
public class ListItem {

    private String mLogin;
    private String mIdProject;
    private String mNameProject;

    //id, login, название,

    public ListItem(String login, String idProject, String nameProject) {
        mIdProject = idProject;
        mLogin = login;
        mNameProject = nameProject;
    }

    public String getmLogin() {
        return mLogin;
    }

    public String getmIdProject() {
        return mIdProject;
    }

    public String getmNameProject() {
        return mNameProject;
    }


}
