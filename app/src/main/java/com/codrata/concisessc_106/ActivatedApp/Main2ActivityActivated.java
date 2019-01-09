package com.codrata.concisessc_106.ActivatedApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.codrata.concisessc_106.NotesActivity;
import com.codrata.concisessc_106.ProfileActivity;
import com.codrata.concisessc_106.R;

public class Main2ActivityActivated extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:

                    Intent i = new Intent(Main2ActivityActivated.this, NotesActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slideinright, R.anim.slideoutright);
                    return true;

                case R.id.navigation_notifications:
                    Intent x = new Intent(Main2ActivityActivated.this, ProfileActivity.class);
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


    public void openWelcomeItemAc(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), WelcomeSelectedAc.class);
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openDetExpAc(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), DetExpSelectAc.class);

        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openConPQAc(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), PastQuestionsAc.class);

        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
}
