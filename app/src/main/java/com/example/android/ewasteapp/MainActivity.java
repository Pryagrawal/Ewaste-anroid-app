package com.example.android.ewasteapp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

   // LocalStore UserLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   // private boolean authenticate(){
//        return  UserLocalStore.getLoggedinUser();
//
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }



    public void go_btn(View view) {
//        switch (view.getId()) {
//            case R.id.button
//                ;
//                User1 user = new User1("null", "null");
              // / UserLocalStore.StoreUserData(user);
//                UserLocalStore.setUserLoggedin(true);
//                break;

            startActivity(new Intent(getApplicationContext(), LoginForm.class));
        }


    }