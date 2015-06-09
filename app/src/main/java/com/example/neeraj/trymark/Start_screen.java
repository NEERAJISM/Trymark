package com.example.neeraj.trymark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by NEERAJ on 08-May-15.
 */
public class Start_screen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState ) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startscreen);

		Thread timer = new Thread(){
			
			public void run(){
				try{
					sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint =new Intent(Start_screen.this,Login.class);
					startActivity(openStartingPoint);
				}
			}	
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//mysong.release();
		finish();
	}

}
