package com.example.nolit.collaborationworldofteamcraft;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AfterCreatePost extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_create_post);

    }

    public void back1(View view){
        Intent intent = new Intent(AfterCreatePost.this, NewPost.class);
        startActivity(intent);
    }

}
