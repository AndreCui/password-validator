package com.example.android.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare the objects
        final EditText password =(EditText) findViewById(R.id.editText);
        final Button   validate= (Button) findViewById(R.id.button);
        final TextView ps =(TextView) findViewById(R.id.textView);
        final Validator validator =new Validator();

          validate.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  String input= password.getText().toString();
                  String output= "";
                  //if input satisfy 5 requirements the output is strong otherwise the password is not strong
                  if(validator.validate(input)==5){
                      output="Password Strength: 5  Strong";
                  }
                  else {
                      output= "Password Strength: " + validator.validate(input)+ " Not Strong.";
                  }

                  ps.setText(output);
              }
          });

    }
}
