package com.example.neeraj.trymark;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseUser;

/**
 * Created by NEERAJ on 08-May-15.
 */

public class Login extends Activity {

    Button signupbutton, loginbutton;
    EditText usernameet, passwordet;
    String username, password;
    Vibrator v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        signupbutton = (Button) findViewById(R.id.bsignup);
        loginbutton = (Button) findViewById(R.id.blogin);
        usernameet = (EditText) findViewById(R.id.edittext_username);
        passwordet = (EditText) findViewById(R.id.edittext_password);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v1.vibrate(60);
                username = usernameet.getText().toString();
                password = passwordet.getText().toString();


                ParseUser.logInInBackground(username, password, new LogInCallback() {
                    public void done(ParseUser user, com.parse.ParseException e) {
                        if (user != null) {
                            // Hooray! The user is logged in.
                            Intent i = new Intent(Login.this, Mainpage.class);
                            startActivity(i);
                        } else {
                            // Signup failed. Look at the ParseException to see what happened.
                            Toast t1 = Toast.makeText(getApplicationContext(), "Wrong username or Password", Toast.LENGTH_SHORT);
                            t1.show();
                        }
                    }
                });
            }
        });

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.vibrate(60);
                overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
                Intent i2 = new Intent(Login.this, Signup.class);
                startActivity(i2);
            }
        });
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        //mysong.release();
        finish();
    }
}