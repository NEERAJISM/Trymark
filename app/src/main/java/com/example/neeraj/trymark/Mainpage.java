package com.example.neeraj.trymark;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by NEERAJ on 27-May-15.
 */
public class Mainpage extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mainpage);


        TextView plumber = (TextView) findViewById(R.id.tvplumber);
        TextView electrician = (TextView) findViewById(R.id.tvelec);
        TextView painter = (TextView) findViewById(R.id.tvpaint);
        TextView mechanic = (TextView) findViewById(R.id.tvmech);
        TextView laundry = (TextView) findViewById(R.id.tvlaund);
        TextView carpenter = (TextView) findViewById(R.id.tvcarp);

        plumber.setOnClickListener(this);
        electrician.setOnClickListener(this);
        painter.setOnClickListener(this);
        mechanic.setOnClickListener(this);
        laundry.setOnClickListener(this);
        carpenter.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
            Vibrator v6 = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            v6.vibrate(60);
            startActivity(new Intent(Mainpage.this,Formone.class));

    }
}
