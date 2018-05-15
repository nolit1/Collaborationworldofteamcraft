package com.example.nolit.collaborationworldofteamcraft;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
    }


    //Функция для получения имени и фамилии в виде строки
//    private String getNameSurname() {
//        EditText nameField = findViewById(R.id.name);
//        Editable nameEditable = nameField.getText();
//
//        EditText nameField1 = findViewById(R.id.surname);
//        Editable nameEditable1 = nameField1.getText();
//
//        return nameEditable.toString()+" "+nameEditable1;
//    }

    //Функция для получения пароля в виде строки
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

    //Функция для получения пароля в виде строки
    private String getPassword2() {
        EditText nameField = findViewById(R.id.password2);
        Editable nameEditable = nameField.getText();
        return nameEditable.toString();
    }

    //Функция для получения пароля в виде строки
//    private String getContacts() {
//        EditText nameField = findViewById(R.id.contacts);
//        Editable nameEditable = nameField.getText();
//        return nameEditable.toString();
//    }

    public void createAccaunt (String name, String login, String Password, String contacts) {
        //функция добавления в БД нового пользователя
    }

}
