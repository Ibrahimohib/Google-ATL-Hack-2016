package edu.xula.atlhack.csgo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Brianna on 11/5/2016.
 */

public class SignUp extends Activity {

    EditText password;
    EditText confirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.signupres);
        password = (EditText)findViewById(R.id.psswdField);
        confirmPass = (EditText)findViewById(R.id.conPsswdField);
        super.onCreate(savedInstanceState);
    }

    public void profile(View v) {
        if( password.getText().toString().compareTo(confirmPass.getText().toString()) != 0){
            confirmPass.setError("passwords don't match");
        } else {
            startActivity(new Intent(SignUp.this, Profile.class));
        }
    }
}
