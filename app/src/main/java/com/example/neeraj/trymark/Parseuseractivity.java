package com.example.neeraj.trymark;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;

/**
 * Created by NEERAJ on 17-May-15.
 */
public class Parseuseractivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "xZ6iSLSLnYWiLRf1kKRs9PUk9rPzB6FXiYgqnT1j", "lBNMBGAb4oxzVEU8SRpYwglj29pviZ1UEawpRTeE");
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
