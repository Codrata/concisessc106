package com.codrata.concisessc_106.DemoApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.codrata.concisessc_106.R;
import com.codrata.concisessc_106.SectionsPageAdapter;
import com.codrata.concisessc_106.Tab1Fragment;
import com.codrata.concisessc_106.Tab2Fragment;

public class TabsDemo extends AppCompatActivity {

    private static final String TAG = "TabsDemo";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_demo);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "DEMO");
        adapter.addFragment(new Tab2Fragment(), "NOTES");
        viewPager.setAdapter(adapter);
    }

    public void openWelcomeItemDemo(View view) {
        Intent intent = null;

        Bundle extras = new Bundle();

        intent = new Intent(TabsDemo.this, WelcomeSelectedDemo.class);
        startActivity(intent);
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openDetExpDemo(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), DetExpSelectDemo.class);
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openConPQDemo(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), PastQuestionsDemo.class);
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
}