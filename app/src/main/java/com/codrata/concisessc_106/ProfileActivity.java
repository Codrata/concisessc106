package com.codrata.concisessc_106;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ProfileActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                    Intent i = new Intent(ProfileActivity.this, NotesActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slideinright, R.anim.slideoutright);
                    return true;

                case R.id.navigation_notifications:

                    return true;


                case R.id.navigation_home:
                    Intent x = new Intent(ProfileActivity.this, Main2Activity.class);
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
        setContentView(R.layout.activity_profile);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
