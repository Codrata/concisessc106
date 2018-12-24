package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void openSignupActivity(View view) {
        super.onBackPressed();
        overridePendingTransition(R.anim.slideinright, R.anim.slideoutleft);
    }
}