package com.example.seifmostafa.checktasty;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import Users.NormalUser;
import Users.User;


public class Signup extends AppCompatActivity {
      public   EditText Username;
      public  EditText password;
       public EditText email;
      public EditText name;
      public EditText creditnumber;
      public EditText creditpassword;
    public static final String APPLICATION_ID ="b3E7HZD4zv5YbWqAmJ0ZuPIZi4qzzDyUsX047J8f",CLIENT_KEY= "3MIfpxOvHfTiZZulSTIFXOes3gmaBkuUp2BhCaUT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button sign = (Button)findViewById(R.id.Button_signup);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
    }

    public void signup() {
        Username = (EditText) findViewById(R.id.editText_username);
        password = (EditText) findViewById(R.id.editText_password);
        email = (EditText) findViewById(R.id.editText_email);
        name = (EditText) findViewById(R.id.editText_name);
        creditnumber = (EditText) findViewById(R.id.editText_creditnumber);
        creditpassword = (EditText) findViewById(R.id.editText_creditpassword);
        try
        {
           // Log.e("USERNAME",Username.getText().toString());
            if(Username.getText().toString().trim().equals("")||password.getText().toString().trim().equals("")||email.getText().toString().trim().equals("")||name.getText().toString().trim().equals(""))
            {
                Toast.makeText(Signup.this,"Username , password , email and  name are REQUIRED.",Toast.LENGTH_LONG);
            }
            else
            {
                ParseUser user = new ParseUser();
                user.setUsername(Username.getText().toString());
                user.setPassword(password.getText().toString());
                user.setEmail(email.getText().toString());
                user.put("name",name.getText().toString());
                user.put("CreditNumber", creditnumber.getText().toString());
                user.put("CreditPassword", creditpassword.getText().toString());

                user.signUpInBackground(new SignUpCallback() {

                    @Override
                    public void done(ParseException e) {

                        if (e != null) {

                            Toast.makeText(Signup.this,
                                    "Saving user failed.", Toast.LENGTH_SHORT).show();

                        } else {

                            Toast.makeText(Signup.this, "Successful Operation",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Signup.this,LoginActivity.class));
                        }
                    }
                });
            }
        }catch (Exception e){
            Log.e("SIGNUP",e.toString());
        }
    }

}
