package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_login);

        rellay1 = findViewById(R.id.rellay1);
        loadingProgressBar = findViewById(R.id.loadingProgressBar);
        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash

    }

    public void openSignupActivity(View view) {

        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slideinright, R.anim.slideoutleft);
    }
}
