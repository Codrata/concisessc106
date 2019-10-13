package com.codrata.concisessc_106.ActivatedApp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.codrata.concisessc_106.R;

public class PastQuestionsAc extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_past_questions_ac);
    }


    public void openAcPQ20012002(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2001-2002-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20022003(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2002-2003-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20032004(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2003-2004-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20052006(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2005-2006-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcPQ20062007(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2006-2007-compressed-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcPQ20072008(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2007-2008-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20082009(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2008-2009-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20092010(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2009-2010-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20102011(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2010-2011-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20112012(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2011-2012-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20122013(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2012-2013 merged-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20132014(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2013-2014-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20142015(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2014-2015-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20152016(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2015-2016-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20162017(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2016-2017-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20172018(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "QUESTIONS 2017-2018-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQMisc(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "miscpq.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

}
