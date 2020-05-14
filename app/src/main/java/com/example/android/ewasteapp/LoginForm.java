package com.example.android.ewasteapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("LoginForm");




    }

    public void signUp_btn(View view) {
        startActivity(new Intent(getApplicationContext(),SignUpForm.class));
    }

    public void login_btn(View view) {
        startActivity(new Intent(getApplicationContext(),EwasteMainPage.class));
    }
}
