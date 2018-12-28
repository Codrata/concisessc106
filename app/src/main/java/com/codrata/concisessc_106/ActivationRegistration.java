package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.ActivatedApp.Main2Activity;
import com.codrata.concisessc_106.ActivatedApp.MainActivity;

public class ActivationRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation_registration);
    }

    public void main2Activity(View view) {
        Intent i = new Intent(ActivationRegistration.this, Main2Activity.class);
        startActivity(i);
        overridePendingTransition(R.anim.slideinleft, R.anim.slideoutright);
        return;
    }

    public void demoactivity(View view) {
        Intent i = new Intent(ActivationRegistration.this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }
}
