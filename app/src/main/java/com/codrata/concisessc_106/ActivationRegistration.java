package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.ActivatedApp.TabsActivated;
import com.codrata.concisessc_106.DemoApp.TabsDemo;

public class ActivationRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation_registration);
    }

    public void main2Activity(View view) {
        Intent i = new Intent(ActivationRegistration.this, TabsActivated.class);
        startActivity(i);
        overridePendingTransition(R.anim.slideinleft, R.anim.slideoutright);
        return;
    }

    public void demoactivity(View view) {
        Intent i = new Intent(ActivationRegistration.this, TabsDemo.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }
}
