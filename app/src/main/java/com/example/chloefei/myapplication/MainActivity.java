package com.example.chloefei.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final EditText editText = (EditText) findViewById(R.id.editText);
       final TextView p=(TextView)findViewById(R.id.password);
       Button button = (Button) findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str=editText.getText().toString();
            Validator vd=new Validator(str);
            if (vd.pass()==5)
                p.setText("Valid Password!");
            else
                p.setText("Password not strong!");
        }
    });
/*
*
*
*      class MyClass implements View.OnClickListener {

       public void onClick(View v){
           EditText editText = (EditText) findViewById(R.id.editText);
           String s=editText.getText().toString().trim();
           TextView p=(TextView)findViewById(R.id.password);

           Validator vd=new Validator(s);
           if (vd.pass()==5)
            p.setText("Valid Password!");
            else
                p.setText("Password not strong!");
        }

    }
* */

    }
}
