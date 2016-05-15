package com.example.seifmostafa.checktasty;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseUser;
import com.parse.RequestPasswordResetCallback;

import java.text.ParseException;

public class ForgetpasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);
        buttons();
    }
    void buttons()
    {
        Button reset = (Button) findViewById(R.id.Button_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ForgetpasswordActivity.this,"RESET CLICKED",Toast.LENGTH_SHORT);
               /* EditText mail = (EditText)findViewById(R.id.editText_forgetpassword_mail);
                if(mail.getText().toString().trim().equals("")||(!mail.getText().toString().trim().contains("@")))
                {
                    Toast.makeText(ForgetpasswordActivity.this,"Enter Valid Mail",Toast.LENGTH_LONG);
                }
                else
                {
                    ParseUser.requestPasswordResetInBackground(mail.getText().toString().trim(), new RequestPasswordResetCallback() {

                        @Override
                        public void done(com.parse.ParseException e) {

                            if (e == null) {
                                Toast.makeText(ForgetpasswordActivity.this,"Successful operation .. Check your mail",Toast.LENGTH_LONG);
                                startActivity(new Intent(ForgetpasswordActivity.this,LoginActivity.class));
                            } else {
                                Toast.makeText(ForgetpasswordActivity.this,"Enter Valid Mail",Toast.LENGTH_LONG);
                            }
                        }
                    });
                }*/
            }
        });
    }

}
