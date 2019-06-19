package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name, password;

    public void makeText (String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();

    }

    public void login (View view) {

        EditText usernameText = (EditText) findViewById(R.id.usernameText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);

        name =usernameText.getText().toString();
        password = passwordText.getText().toString();

        if (name.isEmpty()) {

            makeText("Please enter your username");

        } else if ( password.isEmpty()) {

            makeText("Please enter your password");

        } else if (password.length() < 6 || password.length() > 6) {

            makeText("password should be 6 characters");

        } else {

            makeText("Login Successful");

            usernameText.getText().clear();
            passwordText.getText().clear();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
