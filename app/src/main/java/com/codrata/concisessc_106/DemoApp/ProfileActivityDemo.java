package com.codrata.concisessc_106.DemoApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.codrata.concisessc_106.R;

public class ProfileActivityDemo extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard_demo:
                    Intent i = new Intent(ProfileActivityDemo.this, NotesActivityDemo.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slideinright, R.anim.slideoutright);
                    return true;

                case R.id.navigation_notifications_demo:

                    return true;


                case R.id.navigation_home_demo:
                    Intent x = new Intent(ProfileActivityDemo.this, Main2ActivityDemo.class);
                    startActivity(x);
                    overridePendingTransition(R.anim.slideinright, R.anim.slideoutright);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_demo);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
