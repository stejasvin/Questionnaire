package com.example.questionnaire;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: stejasvin
 * Date: 6/11/12
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Form_Details extends Activity {

    String name=new String(),sex=new String(), age=new String(), rgchoice=new String();

    float rbstar;

    TextView tname, tage, tsex, thobby, rb;

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.form_details);

        name=getIntent().getStringExtra("com.example.questionnaire.NAME");
        sex=getIntent().getStringExtra("com.example.questionnaire.SEX");
        age=getIntent().getStringExtra("com.example.questionnaire.AGE");
        rgchoice=getIntent().getStringExtra("com.example.questionnaire.RGCHOICE");
        rbstar=getIntent().getFloatExtra("com.example.questionnaire.RBSTAR", 0);

        tname = (TextView)findViewById(R.id.etname);
        tage = (TextView)findViewById(R.id.etage);
        tsex = (TextView)findViewById(R.id.etsex);
        thobby = (TextView)findViewById(R.id.rghobby);
        rb=(TextView)findViewById(R.id.rb1);

        tname.setText(name);
        tsex.setText(sex);
        tage.setText(age);
        thobby.setText(rgchoice);
        rb.setText(String.valueOf(rbstar));


    }
}
