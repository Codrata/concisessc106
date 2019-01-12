package com.codrata.concisessc_106;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.ActivatedApp.TabsActivated;
import com.codrata.concisessc_106.DemoApp.MainActivityDemo;
import com.codrata.concisessc_106.DemoApp.TabsDemo;

import static com.codrata.concisessc_106.ActivationActivity.KEY_FIRST_TIME;
import static com.codrata.concisessc_106.ActivationActivity.PREFS_NAME;


public class WelcomeActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory(Intent.CATEGORY_HOME);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, 0);
        boolean firstTime = prefs.getBoolean(KEY_FIRST_TIME, false);

        if (firstTime) {
            Intent sendToSetup = new Intent(this, TabsActivated.class);
            startActivity(sendToSetup);
            finish();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }


    public void demoactivity(View view) {
        Intent i;
        i = new Intent(WelcomeActivity.this, TabsDemo.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }

    public void aboutactivity(View view) {
        Intent i = new Intent(WelcomeActivity.this, About.class);
        startActivity(i);
        overridePendingTransition(R.anim.slideindown, R.anim.zoomout);
        return;
    }


    public void openWecHowTo(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();
        intent = new Intent(getApplicationContext(), MainActivityDemo.class);
        extras.putString("SAMPLE_FILE", "gettingandactivatingtheapp.pdf");
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void openHowToUseTheApp(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();
        intent = new Intent(getApplicationContext(), MainActivityDemo.class);
        extras.putString("SAMPLE_FILE", "howtousetheapp.pdf");
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void ActivationActivity(View view) {
        Intent i = new Intent(WelcomeActivity.this, ActivationActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }
}