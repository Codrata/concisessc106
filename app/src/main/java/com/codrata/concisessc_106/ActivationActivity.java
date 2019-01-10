package com.codrata.concisessc_106;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.codrata.concisessc_106.ActivatedApp.TabsActivated;
import com.codrata.concisessc_106.Model.ActivationCode;
import com.codrata.concisessc_106.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ActivationActivity extends AppCompatActivity {
    EditText edtcode1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation);
        edtcode1 = (EditText) findViewById(R.id.edtcode1);


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

                        Intent ActivatedIntent = new Intent(ActivationActivity.this, TabsActivated.class);
                        startActivity(ActivatedIntent);
                        finish();
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

    public void main2Activity(View view) {
        activateUser();
        overridePendingTransition(R.anim.slideinleft, R.anim.slideoutright);
        return;
    }
}