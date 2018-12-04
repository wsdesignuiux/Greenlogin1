package com.example.vaibhav.greenlogin1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Greenlogin1Activity extends AppCompatActivity {
    EditText user;
    EditText pass;
    EditText email;
    EditText mob;
    TextView login;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greenlogin1);Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");

        user = (EditText) findViewById(R.id.user);
        user.setTypeface(custom_font);

        pass = (EditText) findViewById(R.id.pass);
        pass.setTypeface(custom_font);
        email = (EditText) findViewById(R.id.email);
        email.setTypeface(custom_font);

        mob = (EditText) findViewById(R.id.mob);
        mob.setTypeface(custom_font);

        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");

        signup = (TextView) findViewById(R.id.signup);
        signup.setTypeface(custom_font1);
        login = (TextView) findViewById(R.id.login);
        login.setTypeface(custom_font);

    }
}
