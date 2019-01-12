package com.codrata.concisessc_106;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.codrata.concisessc_106.DemoApp.TabsDemo;
import com.codrata.concisessc_106.Model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.codrata.concisessc_106.ActivationActivity.PREFS_NAME;

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
    CheckBox chkBox1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation_registration);
        //initialiaze fiebase

        //FirebaseApp.initializeApp(this);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        //
        rellay1 = findViewById(R.id.rellay1);
        loadingProgressBar = findViewById(R.id.loadingProgressBar);
        //chkbox1 = (CheckBox) findViewById(R.id.chkbox1);
        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash

        edtname = findViewById(R.id.edtname);
        edtemail = findViewById(R.id.edtemail);
        edtphone = findViewById(R.id.edtphone);
        edtdepartment = findViewById(R.id.edtdepartment);
        chkBox1 = findViewById(R.id.chkBox1);


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
        final String password = edtphone.getText().toString().trim();
        final String department = edtdepartment.getText().toString().trim();

        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("EMAIL", email);
        editor.putString("NAME", name);
        editor.putString("DEPT", department);

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


        if (password.length() != 11) {
            edtphone.setError("Please Input A Valid No");
            edtphone.requestFocus();
            mDialog.dismiss();
            return;
        }

        if (!chkBox1.isChecked()) {
            Toast.makeText(ActivationRegistration.this, "Please Accept Terms and Condition", Toast.LENGTH_LONG).show();
            mDialog.dismiss();
            return;
        }

        mDialog.show();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            User user = new User(edtname.getText().toString(), edtemail.getText().toString(), edtphone.getText().toString(), edtdepartment.getText().toString());
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
