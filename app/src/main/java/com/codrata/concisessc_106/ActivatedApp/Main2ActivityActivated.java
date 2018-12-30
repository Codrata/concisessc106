package com.codrata.concisessc_106.ActivatedApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.codrata.concisessc_106.R;

public class Main2ActivityActivated extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:

                    Intent i = new Intent(Main2ActivityActivated.this, NotesActivityActivated.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slideinright, R.anim.slideoutright);
                    return true;

                case R.id.navigation_notifications:
                    Intent x = new Intent(Main2ActivityActivated.this, ProfileActivityActivated.class);
                    startActivity(x);
                    overridePendingTransition(R.anim.slideinright, R.anim.slideoutright);

                    return true;

                case R.id.navigation_home:


                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    public void OpenFirstPDF(View view) {
        Intent i = new Intent(Main2ActivityActivated.this, MainActivityActivated.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }

}
