package com.example.seifmostafa.checktasty;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseUser;
import com.parse.RequestPasswordResetCallback;

import java.text.ParseException;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Buutons();

    }
    void  Buutons()
    {


        Button login = (Button) findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText username = (EditText) findViewById(R.id.editText_username);
                final EditText passwrod = (EditText) findViewById(R.id.editText_password);
                if(username.getText().toString().trim().equals("")||passwrod.getText().toString().trim().equals(""))
                {
                    Toast.makeText(LoginActivity.this,"Username and password are REQUIRED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ParseUser.logInInBackground(username.getText().toString(), passwrod.getText().toString(), new LogInCallback() {

                        @Override
                        public void done(ParseUser user, com.parse.ParseException e) {
                            if (user != null) {
                                startActivity(new Intent(LoginActivity.this, listActivity.class));
                                Toast.makeText(LoginActivity.this, "Hello," + username.getText().toString(), Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(LoginActivity.this, "Something wrong in username or password", Toast.LENGTH_SHORT).show();
                                Log.e("LOGGINGIN", e.toString());
                            }
                        }
                    });
                }
            }
        });
         Button signup = (Button) findViewById(R.id.button_Signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(LoginActivity.this, Signup.class));
                Toast.makeText(LoginActivity.this,"Create your account ..",Toast.LENGTH_SHORT).show();
            }

        });

        Button forgetpassword = (Button) findViewById(R.id.button_forgetpassword);
        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(LoginActivity.this, ForgetpasswordActivity.class),1);
                Toast.makeText(LoginActivity.this,"Reset Password ..",Toast.LENGTH_SHORT).show();
                    }
                });
        }
}
