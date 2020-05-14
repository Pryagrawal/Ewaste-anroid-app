package com.example.android.ewasteapp;

public class User1 {

    String name ;
    String  username ;
    String email ;
    String  password;

    public User1(String name, String  username, String email,String  password)
    {  this.username= username;
        this.name= name;
        this.email= email;
        this.password= password;


    }
    public  User1( String  username, String  password) {
        this.username = username;
        this.password = password;


    }
}
