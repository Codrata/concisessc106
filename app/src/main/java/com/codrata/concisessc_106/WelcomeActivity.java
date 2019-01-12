package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.DemoApp.MainActivityDemo;
import com.codrata.concisessc_106.DemoApp.TabsDemo;


public class WelcomeActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";
    public static final String KEY_FIRST_TIME = "firstTime";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


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