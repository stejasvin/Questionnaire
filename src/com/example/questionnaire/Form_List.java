package com.example.questionnaire;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/**
 * Created with IntelliJ IDEA.
 * User: stejasvin
 * Date: 5/11/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Form_List extends ListActivity {

    String name= new String(),sex= new String(),age=new String(),rgchoice=new String();
    float rbstar;
    String[] list = new String[]{"Details", "Back to Log In Screen", "Exit"};

    TextView tname, tage, tsex, thobby;
    RatingBar rb;
    Button bnext;
    RadioButton radioButton;
    Intent intent = new Intent("com.example.questionnaire.DETAILS");


  @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

      name=getIntent().getStringExtra("com.example.questionnaire.NAME");
      sex=getIntent().getStringExtra("com.example.questionnaire.SEX");
      age=getIntent().getStringExtra("com.example.questionnaire.AGE");
      rgchoice=getIntent().getStringExtra("com.example.questionnaire.RGCHOICE");
      rbstar=getIntent().getFloatExtra("com.example.questionnaire.RBSTAR", 0);


        /*
        tname = (TextView)findViewById(R.id.etname);
        tage = (TextView)findViewById(R.id.etage);
        tsex = (TextView)findViewById(R.id.etsex);
        thobby = (TextView)findViewById(R.id.rghobby);
        radioButton=(RadioButton)findViewById(rgchoice);
        //rg = (RadioGroup)findViewById(R.id.rgGroup);
        //rb = (RatingBar)findViewById(R.id.rb1);

        tname.setText(name);
        tsex.setText(sex);
        tage.setText(age);
        thobby.setText(radioButton.getText());
        rb.setNumStars(rbstar);
        */
        setListAdapter(new ArrayAdapter<String>(this, R.layout.form_singleitem, list));
        final ListView List = getListView();

      List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.

                switch(i){

                    case 0: intent.putExtra("com.example.questionnaire.NAME",name);
                        intent.putExtra("com.example.questionnaire.AGE",age);
                        intent.putExtra("com.example.questionnaire.SEX",sex);
                        intent.putExtra("com.example.questionnaire.RGCHOICE",rgchoice);
                        intent.putExtra("com.example.questionnaire.RBSTAR",rbstar);
                            startActivity(intent);
                            break;

                    case 1: startActivity(new Intent("com.example.questionnaire.LOGIN"));//Intent to login page
                        finish();
                        //System.exit(0);
                        break;

                    case 2: finish();
                        //System.exit(0);
                        break;
                }
            }
        });

    }


}
