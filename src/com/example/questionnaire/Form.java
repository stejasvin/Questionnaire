package com.example.questionnaire;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;

public class Form extends Activity{

    TextView name, age, sex;
    RadioGroup rg;
    RatingBar rb;
    Button bnext;
    Intent intent = new Intent("com.example.questionnaire.LIST");
    String radioButtonText = new String();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_layout);

        name = (TextView)findViewById(R.id.editText1);
        age = (TextView)findViewById(R.id.editText2);
        sex = (TextView)findViewById(R.id.editText3);

        rg = (RadioGroup)findViewById(R.id.rgGroup);

        rb = (RatingBar)findViewById(R.id.ratingBar1);

        bnext = (Button)findViewById(R.id.button1);
        bnext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                radioButtonText=((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
                //Toast t = Toast.makeText(Form.this,radioButtonText,Toast.LENGTH_SHORT);
                //t.show();
                intent.putExtra("com.example.questionnaire.NAME",name.getText().toString());
                intent.putExtra("com.example.questionnaire.AGE",age.getText().toString());
                intent.putExtra("com.example.questionnaire.SEX",sex.getText().toString());
                intent.putExtra("com.example.questionnaire.RGCHOICE",radioButtonText);
                intent.putExtra("com.example.questionnaire.RBSTAR",rb.getRating());

                startActivity(intent);
                finish();
            }
        });
	}
	
	

}
