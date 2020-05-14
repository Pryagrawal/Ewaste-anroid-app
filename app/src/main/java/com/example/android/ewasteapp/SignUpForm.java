package com.example.android.ewasteapp;

import android.content.Intent;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpForm extends AppCompatActivity  {
    Button bRegister;
    EditText name, Username, password, email;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_form);
        getSupportActionBar().setTitle("SignUpForm");

        firebaseAuth=FirebaseAuth.getInstance();

       name=(TextInputEditText) findViewById(R.id.textInputLayout1);
        Username=(TextInputEditText) findViewById(R.id.textInputLayout1);
        password=(TextInputEditText) findViewById(R.id.textInputLayout1);
        email=(TextInputEditText) findViewById(R.id.textInputLayout1);
        bRegister=(Button) findViewById(R.id.signUp_btn);


        //bRegister.setOnClickListener(this);

    }



    public void signUp_btn(View view) {
        String vname= name.getText().toString();
        String vUsername= Username.getText().toString();
        String vpassword= password.getText().toString();
        String vemail= email.getText().toString();

        User1 registeredData =new User1(vname, vUsername,vpassword,vemail);

        firebaseAuth.createUserWithEmailAndPassword(vemail,vpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    Toast.makeText(SignUpForm.this, "Registration Succesfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignUpForm.this,LoginForm.class));
                }else
                    Toast.makeText(SignUpForm.this, "Registration failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    @Override
//    public void onClick(View view) {
    //    /switch (view.getId())
   //     case R.id.bRegister;
//            String vname= name.getText().toString();
//            String vUsername= Username.getText().toString();
//            String vpassword= password.getText().toString();
//            String vemail= email.getText().toString();
//
//            User1 registeredData =new User1(vname, vUsername,vpassword,vemail);
//
//            firebaseAuth.createUserWithEmailAndPassword(vemail,vpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//
//                    if (task.isSuccessful()){
//                    Toast.makeText(SignUpForm.this, "Registration Succesfull", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(SignUpForm.this,LoginForm.class));
//                }else
//                        Toast.makeText(SignUpForm.this, "Registration failed", Toast.LENGTH_SHORT).show();
//                }
//            });
  //          break;



    }

