package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ProgressBar;

public class SignUpActivity extends AppCompatActivity {
    CardView rellay1;
    ProgressBar loadingProgressBar;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            loadingProgressBar.setVisibility(View.GONE); // hide progress bar after display
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        rellay1 = findViewById(R.id.rellay1);
        loadingProgressBar = findViewById(R.id.loadingProgressBar);
        handler.postDelayed(runnable, 1000); //1000 is the timeout for the splash
    }

    public void signUp(View view) {
        Intent i = new Intent(SignUpActivity.this, Main2Activity.class);
        startActivity(i);
        overridePendingTransition(R.anim.slideinleft, R.anim.slideoutright);
        return;
    }

    public void logIn(View view) {
        Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }

}