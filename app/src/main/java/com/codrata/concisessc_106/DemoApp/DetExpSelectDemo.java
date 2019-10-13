package com.codrata.concisessc_106.DemoApp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.R;

public class DetExpSelectDemo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_exp_select);
    }

    public void openFunctionsDem(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "FUNCTIONS (1).pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openMatricesDem(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "MATRICES-merged-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openDifferentiationDem(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "DIFFERENTIATION (1)-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openPartialDefDem(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "PARTIAL DIFFERENTIATION-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openAppOfDiffDem(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();
        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "DIFFERENTIATION APPLICATIONS-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openIntegrationDem(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "INTEGRATION-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

    }

    public void openDiffEquationsDem(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "DIFFERENTIAL EQUATIONS-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }


    public void openAppOfCalcEconsDem(View view) {

        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "CALCULUS APPLICATION TO ECO LATEST-compressed.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    public void openMathsInEconsDemo(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "MATHEMATICS IN SOCIAL SCIENCES (2)-min.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

   /* public void openAddendumDemo(View view) {
        Intent intent = null;
        Bundle extras = new Bundle();

        intent = new Intent(getApplicationContext(), MainActivityDemo.class);

        extras.putString("SAMPLE_FILE", "addendumnotes.pdf");
        intent.putExtras(extras);
        startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }*/
}
