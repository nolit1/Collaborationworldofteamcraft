package com.example.nolit.collaborationworldofteamcraft;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    public static final String APP_PREFERENCES = "mysettings";

    public static final String APP_PREFERENCES_NAME = "name"; // логин
    public static final String APP_PREFERENCES_PASSWORD = "password"; // пароль

    SharedPreferences mSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);


        if(mSettings.contains(APP_PREFERENCES_NAME)) {
//            TextView login = findViewById(R.id.login);
//            TextView password = findViewById(R.id.password);
//            login.setText(mSettings.getString(APP_PREFERENCES_NAME, ""));
//            password.setText(mSettings.getString(APP_PREFERENCES_PASSWORD, ""));
            Intent intent = new Intent(Login.this, NewPost.class);
            startActivity(intent);
        }
    }

    //Функция для кнопки ВОЙТИ, менять надо, наверное, на главный экран будет отправлять
    public void login(View view) {

        /**добавить проверку с серваком */

        SharedPreferences.Editor editor = mSettings.edit();
        editor.putString(APP_PREFERENCES_NAME, getLogin());
        editor.putString(APP_PREFERENCES_PASSWORD, getPassword());
        editor.apply();
        Intent intent = new Intent(Login.this, NewPost.class);
        startActivity(intent);
    }

    //Функция для кнопки РЕГИСТРАЦИЯ, менять не надо, готово
    public void registration (View view) {
        Intent intent = new Intent(Login.this, Registration.class);
        startActivity(intent);
    }

    //Функция для получения логина в виде строки
    private String getLogin() {
        EditText nameField = findViewById(R.id.login);
        Editable nameEditable = nameField.getText();
        return nameEditable.toString();
    }

    //Функция для получения пароля в виде строки
    private String getPassword() {
        EditText nameField = findViewById(R.id.password);
        Editable nameEditable = nameField.getText();
        return nameEditable.toString();
    }
}
