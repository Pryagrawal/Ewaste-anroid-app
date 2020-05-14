package com.example.android.ewasteapp;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStore {

    public static final String SP_Name="userDetails";
    SharedPreferences UserLocalDatabase;

    public LocalStore(Context context){
        UserLocalDatabase= context.getSharedPreferences(SP_Name,0);

    }

    public void StoreUserData(User1 user){
        SharedPreferences.Editor spEditor=UserLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("email",user.email);
        spEditor.putString("password",user.password);
        spEditor.putString("username", user.username);
    }
    public User1 getLoggedinUser(){
        String name=UserLocalDatabase.getString("name","");
        String email =UserLocalDatabase.getString("email","");
        String password=UserLocalDatabase.getString("password","");
        String username=UserLocalDatabase.getString("username","");

       User1 storeUser=new User1(name, username, email,password);
       return storeUser;
    }

    public void setUserLoggedin(boolean LoggeIn){
        SharedPreferences.Editor spEditor=UserLocalDatabase.edit();
        spEditor.putBoolean("LoggeIn",LoggeIn);
        spEditor.commit();
    }

    public void  clearUserData(){
        SharedPreferences.Editor spEditor=UserLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();

    }



}


