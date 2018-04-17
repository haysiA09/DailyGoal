package com.example.a16022877.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        String[]info=i.getStringArrayExtra("info");
        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setText("Read up on the materials before class: "+info[0]+"\nArrive on time so as to not miss important part of the lesson: "+info[1]+"\nAttempt the problem myself: "+info[2]+"\nReflection: "+info[3]);

    }
}
