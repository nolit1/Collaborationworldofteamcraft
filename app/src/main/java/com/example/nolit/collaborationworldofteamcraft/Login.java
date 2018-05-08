package com.example.nolit.collaborationworldofteamcraft;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    //Функция для кнопки ВОЙТИ, менять надо, наверное, на главный экран будет отправлять
    public void login(View view) {
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
