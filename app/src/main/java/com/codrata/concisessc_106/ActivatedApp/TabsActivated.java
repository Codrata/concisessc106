package com.codrata.concisessc_106.ActivatedApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.codrata.concisessc_106.About;
import com.codrata.concisessc_106.NotesActivity;
import com.codrata.concisessc_106.R;
import com.codrata.concisessc_106.SectionsPageAdapter;
import com.codrata.concisessc_106.Tab1FragmentAc;
import com.codrata.concisessc_106.Tab2Fragment;

public class TabsActivated extends NotesActivity {


    private static final String TAG = "TabsActivated";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;
    TextView dpLicense, dpEmail, dpDept, dpName;

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_ac);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.containerAc);
        setupViewPager(mViewPager);


        TabLayout tabLayout = findViewById(R.id.tabsAc);
        tabLayout.setupWithViewPager(mViewPager);

    }


    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1FragmentAc(), "ACTIVATED");
        adapter.addFragment(new Tab2Fragment(), "NOTES");
        viewPager.setAdapter(adapter);
    }

    public void openWelcomeItemAc(View view) {

        Bundle extras = new Bundle();

        Intent intent = new Intent(getApplicationContext(), WelcomeSelectedAc.class);
        startActivity(intent);
        intent.putExtras(extras);
        startActivity(intent);
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

    public void onClickFab(View view) {

        Save("Note1.txt");
    }


    public void aboutactivity(View view) {

        Intent i = new Intent(getApplicationContext(), About.class);
        startActivity(i);
        overridePendingTransition(R.anim.slideindown, R.anim.zoomout);
        return;

    }
}