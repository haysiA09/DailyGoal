package com.example.a16022877.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOK=(Button)findViewById(R.id.buttonOK);
        final EditText et4=(EditText)findViewById(R.id.editTextQ4);

        btnOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){

                RadioGroup rg1=(RadioGroup)findViewById(R.id.Q1);
                RadioGroup rg2=(RadioGroup)findViewById(R.id.Q2);
                RadioGroup rg3=(RadioGroup)findViewById(R.id.Q3);


                //Q1
                int selectedButtonID1=rg1.getCheckedRadioButtonId();
                RadioButton rb1=(RadioButton)findViewById(selectedButtonID1);
                //Q2
                int selectedButtonID2= rg2.getCheckedRadioButtonId();
                RadioButton rb2=(RadioButton)findViewById(selectedButtonID2);
                //Q3
                int selectedButtonID3= rg2.getCheckedRadioButtonId();
                RadioButton rb3=(RadioButton)findViewById(selectedButtonID3);
                //store in Array
                String[]info={rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),et4.getText().toString()};

                //Create Intent
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}
