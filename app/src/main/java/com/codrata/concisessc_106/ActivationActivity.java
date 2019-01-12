package com.codrata.concisessc_106;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.codrata.concisessc_106.ActivatedApp.TabsActivated;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ActivationActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "MyPrefsFile";
    public static final String KEY_FIRST_TIME = "firstTime";
    EditText edtcode1, editEmail, editName;
    //SharedPreferences sharedpreferences;
    //String Activated = sharedpreferences.getString("ACTIVATED", "");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation);
        edtcode1 = findViewById(R.id.edtcode1);
        //sharedpreferences = getSharedPreferences("ACTIVATED", Context.MODE_PRIVATE);

    }


    //int firebase
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    //final DatabaseReference table_user = database.getReference("User");
    final DatabaseReference table_activationcode = database.getReference("ActivationCode");

    private void activateUser() {
        final String Code = edtcode1.getText().toString().trim();

        final ProgressDialog mDialog = new ProgressDialog(ActivationActivity.this);
        mDialog.setMessage("Activating.....");
        mDialog.show();

        if (Code.isEmpty()) {
            edtcode1.setError("Activation Code is Required");
            edtcode1.requestFocus();
            mDialog.dismiss();
            return;
        }


        if (Code.length() != 7) {
            edtcode1.setError("Please Input A Valid Activation Code");
            edtcode1.requestFocus();
            mDialog.dismiss();
            return;
        }

        mDialog.show();
        table_activationcode.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //check if user not exist in database
                if(dataSnapshot.child(edtcode1.getText().toString()).exists()) {
                    //get user information
                    mDialog.dismiss();
                    //remove code from firebase
                    String delete= edtcode1.getText().toString();
                       table_activationcode.child(delete).removeValue();
                       // store user data


                        Intent ActivatedIntent = new Intent(ActivationActivity.this, TabsActivated.class);
                    ActivatedIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                        startActivity(ActivatedIntent);
                    ActivationActivity.this.finish();
                }else{
                    mDialog.dismiss();
                    Toast.makeText(ActivationActivity.this, "Invalid Activation Code !", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
   /* @Override
    protected void onStart() {
        super.onStart();
        if (Activated.equals("ACTIVATED")){
            //handle the already login user
            Intent i = new Intent(ActivationActivity.this, TabsActivated.class);
            startActivity(i);
            //overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
        } else {
            Intent i = new Intent(ActivationActivity.this, ActivationActivity.class);
            startActivity(i);
        }
    }*/
    public void main2Activity(View view) {

        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = preferences.edit();

        EditText editLicense = findViewById(R.id.edtcode1);

        String licensekey = editLicense.getText().toString();

        editor.putBoolean(KEY_FIRST_TIME, true);

        editor.putString("LICENSE_KEY", licensekey);

        editor.commit();
        activateUser();
        overridePendingTransition(R.anim.slideinleft, R.anim.slideoutright);
        return;
    }

}