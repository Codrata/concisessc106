package com.codrata.concisessc_106;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codrata.concisessc_106.ActivatedApp.TabsActivated;
import com.codrata.concisessc_106.DemoApp.TabsDemo;
import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import com.codrata.concisessc_106.Model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ActivationRegistration extends AppCompatActivity {
    private FirebaseAuth mAuth;
    static final int PERMISSION_READ_STATE = 123;
    ProgressBar loadingProgressBar;
    //ProgressBar progressBar;
    CardView rellay1;
    //CheckBox chkbox1;
    //SharedPreferences prefernce;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            loadingProgressBar.setVisibility(View.GONE); // hide progress bar after display
        }
    };

    EditText edtname, edtemail, edtphone, edtpin, edtdepartment;
    TextView actvkey;
    TelephonyManager tm;
    String IMEI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation_registration);
        //initialiaze fiebase

        //FirebaseApp.initializeApp(this);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        // chek if phone permission is granted
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);
        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, PERMISSION_READ_STATE);
        }
        //
        rellay1 = findViewById(R.id.rellay1);
        loadingProgressBar = findViewById(R.id.loadingProgressBar);
        //chkbox1 = (CheckBox) findViewById(R.id.chkbox1);
        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash

        edtname = (EditText) findViewById(R.id.edtname);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtphone = (EditText) findViewById(R.id.edtphone);
        edtpin = (EditText) findViewById(R.id.edtpin);
        edtdepartment = (EditText) findViewById(R.id.edtdepartment);

        //Generate IMEI no
        actvkey = (TextView) findViewById(R.id.actvkey);
        tm = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        IMEI = tm.getDeviceId();
        // Revesrs IMEI
        StringBuffer buffer = new StringBuffer(IMEI);
        buffer.reverse();

        actvkey.setText(buffer);

    }

    //int firebase
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference table_user = database.getReference("User");

    @Override
    protected void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() != null) {
            //handle the already login user
            Intent i = new Intent(ActivationRegistration.this, WelcomeActivity.class);
            startActivity(i);
            //overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

        }
    }

    private void registerUser() {
        final String name = edtname.getText().toString().trim();
        final String email = edtemail.getText().toString().trim();
        final String password = edtpin.getText().toString().trim();
        final String phone = edtphone.getText().toString().trim();
        final String department = edtdepartment.getText().toString().trim();

        final ProgressDialog mDialog = new ProgressDialog(ActivationRegistration.this);
        mDialog.setMessage("Activating.....");
        mDialog.show();

        if (name.isEmpty()) {
            edtname.setError("Name is Required");
            edtname.requestFocus();
            mDialog.dismiss();
            return;
        }

        if (email.isEmpty()) {
            edtemail.setError("E-mail is Required");
            edtemail.requestFocus();
            mDialog.dismiss();
            return;
        }
        if (password.isEmpty()) {
            edtpin.setError("Pin is Required");
            edtpin.requestFocus();
            mDialog.dismiss();
            return;
        }

        if (phone.isEmpty()) {
            edtphone.setError("Phone Number is Required");
            edtphone.requestFocus();
            mDialog.dismiss();
            return;
        }
        if (department.isEmpty()) {
            edtdepartment.setError("Department is Required");
            edtdepartment.requestFocus();
            mDialog.dismiss();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtemail.setError("E-mail is Invalid");
            edtemail.requestFocus();
            mDialog.dismiss();
            return;
        }


        if (password.length() < 6) {
            edtpin.setError("Password must be Greater than 5");
            edtpin.requestFocus();
            mDialog.dismiss();
            return;
        }


        if (phone.length() != 11) {
            edtphone.setError("Please Input A Valid No");
            edtphone.requestFocus();
            mDialog.dismiss();
            return;
        }

        mDialog.show();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            User user = new User(edtname.getText().toString(),edtemail.getText().toString(),edtphone.getText().toString(),edtpin.getText().toString(),edtdepartment.getText().toString(),actvkey.getText().toString());
                            //table_user.child(edtphone.getText().toString()).setValue(user);

                            FirebaseDatabase.getInstance().getReference("User")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    mDialog.dismiss();
                                    if (task.isSuccessful()) {
                                        Toast.makeText(ActivationRegistration.this, "Registration Succesful", Toast.LENGTH_LONG).show();
                                        Intent i = new Intent(ActivationRegistration.this, WelcomeActivity.class);
                                        startActivity(i);
                                    } else {
                                        //display a failure message
                                    }
                                }
                            });

                        } else {
                            mDialog.dismiss();
                            Toast.makeText(ActivationRegistration.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }


    public void WelcomeActivity(View view) {
        registerUser();
    }

    public void demoactivity(View view) {
        Intent i = new Intent(ActivationRegistration.this, TabsDemo.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        return;
    }
}
