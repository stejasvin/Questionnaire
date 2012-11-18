package com.example.questionnaire;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;


public class MainActivity extends Activity {

		EditText username;
		TextView password;
		Button logIn;
		Intent intent = new Intent("com.example.questionnaire.FORM");
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        username = (EditText)findViewById(R.id.editText2);
        password = (TextView)findViewById(R.id.editText1);
       
        logIn = (Button)findViewById(R.id.button1);
        logIn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if((password.getText().toString()).equalsIgnoreCase("adg")){
					Toast t = Toast.makeText(MainActivity.this, "correct Password", Toast.LENGTH_SHORT);
					t.show();
					startActivity(intent);
					finish();
				}
				else{
					Toast t = Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT);
					t.show();
					password.setText("");
				}
				
			}
		});
    }

}
