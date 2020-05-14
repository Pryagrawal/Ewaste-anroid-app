package com.example.android.ewasteapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EwasteMainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewaste_main_page);

    }

    public void some_btn(View view) {
        startActivity(new Intent(getApplicationContext(),RecyclingCompanies.class));
    }

    public void post_btn(View view) {
        startActivity(new Intent(getApplicationContext(),Post.class));
    }

    public void gallery_btn(View view) {
        startActivity(new Intent(getApplicationContext(),SignUpForm.class));
    }

    public void collpoint_btn(View view) {
        startActivity(new Intent(getApplicationContext(),CollectionPoints.class));
    }
}
