package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class WelcomeActivity extends AppCompatActivity {
    ProgressBar loadingProgressBar;
    LinearLayout linearLayout1;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            linearLayout1.setVisibility(View.VISIBLE);
            loadingProgressBar.setVisibility(View.GONE); // hide progress bar after display
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        linearLayout1 = findViewById(R.id.linearLayout1);
        loadingProgressBar = findViewById(R.id.loadingProgressBar);
        handler.postDelayed(runnable, 1000); //1000 is the timeout for the splash


    }

    public void registrationactivity(View view) {
        Intent i = new Intent(WelcomeActivity.this, ActivationRegistration.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }

    public void demoactivity(View view) {
        Intent i = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }

    public void aboutactivity(View view) {
        Intent i = new Intent(WelcomeActivity.this, About.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }
}