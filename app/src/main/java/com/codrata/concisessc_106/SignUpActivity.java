package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void signUp(View view) {
        Intent i = new Intent(SignUpActivity.this, Main2Activity.class);
        startActivity(i);
        return;
    }

    public void logIn(View view) {
        Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(i);
        return;
    }

}