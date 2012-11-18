package com.example.questionnaire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: stejasvin
 * Date: 6/11/12
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        startActivity(new Intent("com.example.questionnaire.LOGIN"));
        finish();
    }
}

