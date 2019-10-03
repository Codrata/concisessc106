package com.codrata.concisessc_106.ActivatedApp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.codrata.concisessc_106.R;


public class WelcomeSelectedAc extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_welcome_selected_ac);
    }

    public void openAcFirstItem(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);

        extras.putString("SAMPLE_FILE", "WELCOME TO THE SSC106 WAY-1-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcGetAndAct(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);

        extras.putString("SAMPLE_FILE", "GETTING AND ACTIVATING THE APPLICATION-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcHowTo(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "USING THE SSC106 WAY (1)-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcTopicRev(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);

        extras.putString("SAMPLE_FILE", "TOPIC REVIEW-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcBasicOp(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "BASIC OPERATIONS IN MATHEMATICS-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }
}
