package com.codrata.concisessc_106.ActivatedApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.R;

public class PastQuestionsAc extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_questions_ac);
    }


    public void openAcPQ20012002(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20012002.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20022003(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20022003.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20032004(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20032004.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20052006(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20052006.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcPQ20062007(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20062007.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openAcPQ20072008(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20072008.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20082009(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20082009.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20092010(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20092010.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20102011(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20102011pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20112012(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20112012.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20122013(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20122013.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20132014(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20132014.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20142015(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20142015.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20152016(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "pq20152016.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAcPQ20162017(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityActivated.class);
        extras.putString("SAMPLE_FILE", "openAcPQ20162017.pdf");
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
