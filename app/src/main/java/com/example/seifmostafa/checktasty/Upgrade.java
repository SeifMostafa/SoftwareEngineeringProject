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

import com.parse.ParseUser;

public class Upgrade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade);
        Buttons();
    }
    public  void Buttons()
    {
        final EditText creditnmber = (EditText) findViewById(R.id.editText_creditnumber);
        final EditText creditpassword = (EditText) findViewById(R.id.editText_creditcardpassword);

        Button upgrade = (Button) findViewById(R.id.button_upgrade);
        upgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser parseUser = ParseUser.getCurrentUser();
                parseUser.put("CreditNumber",creditnmber.getText().toString().trim());
                parseUser.put("CreditPassword",creditpassword.getText().toString().trim());
                startActivity(new Intent(Upgrade.this,listActivity.class));
            }
        });

    }

}
