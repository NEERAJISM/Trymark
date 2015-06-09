package com.example.neeraj.trymark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by NEERAJ on 24-May-15.
 */
public class Formone extends Activity {

    EditText name,workers,days,descp;
    String stname,stworkers,stdays,stdescp,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formfilltask);


        name = (EditText) findViewById(R.id.etname);
        workers = (EditText) findViewById(R.id.etworkers);
        days = (EditText) findViewById(R.id.etdays);
        descp = (EditText) findViewById(R.id.etdescription);

        Button b = (Button) findViewById(R.id.bnext);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator v4 = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                v4.vibrate(60);
                String emailadd[] = {"mymailboxmark2@gmail.com"};
                stname = name.getText().toString();
                stworkers = workers.getText().toString();
                stdays = days.getText().toString();
                stdescp = descp.getText().toString();
                message = "Name : "+ stname + "\nWorkers : "+ stworkers + "\nDays : "+stdays+"\nDescription : "+stdescp;
                Intent emailint = new Intent(android.content.Intent.ACTION_SEND);
                emailint.setType("plain/text");
                emailint.putExtra(android.content.Intent.EXTRA_EMAIL, emailadd);
                emailint.putExtra(android.content.Intent.EXTRA_SUBJECT, "Service Description");
                emailint.putExtra(android.content.Intent.EXTRA_TEXT, message);
                startActivity(emailint);

            }
        });
    }
}
