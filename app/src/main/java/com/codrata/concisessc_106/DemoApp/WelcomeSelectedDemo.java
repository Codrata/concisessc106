package com.codrata.concisessc_106.DemoApp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.ActivatedApp.MainActivityActivated;
import com.codrata.concisessc_106.R;

public class WelcomeSelectedDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_selected);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void openFirstItem(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "WELCOME TO THE SSC106 WAY-1-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openGetAndAct(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "GETTING AND ACTIVATING THE APPLICATION-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openHowTo(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);
        extras.putString("SAMPLE_FILE", "USING THE SSC106 WAY (1)-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openTopicRev(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "TOPIC REVIEW-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openBasicOp(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "BASIC OPERATIONS IN MATHEMATICS-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void OnbackPressed() {

        super.onBackPressed();

    }
}
