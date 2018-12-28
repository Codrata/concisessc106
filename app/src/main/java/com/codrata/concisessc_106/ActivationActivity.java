package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.ActivatedApp.Main2ActivityActivated;

public class ActivationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation);


    }

    public void main2Activity(View view) {
        Intent i = new Intent(ActivationActivity.this, Main2ActivityActivated.class);
        startActivity(i);
        overridePendingTransition(R.anim.slideinleft, R.anim.slideoutright);
        return;
    }
}