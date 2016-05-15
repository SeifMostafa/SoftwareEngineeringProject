package com.example.seifmostafa.checktasty;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.ArrayList;

public class CreatingPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_post);
        checkin();
        Buttons();
    }
    public void checkin()
    {
        String PLACE="";
        boolean addingnewplace=false;
        ParseUser user = ParseUser.getCurrentUser();
        String creditnum = (String) user.get("CreditNumber");
        if(!creditnum.trim().equals(""))
        {
            addingnewplace=true;
        }
        final EditText place = (EditText) findViewById(R.id.editText_checkin);
        if(addingnewplace)
        {
            place.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(CreatingPostActivity.this);
                        builder1.setMessage("You wanna add  new place?");
                        builder1.setCancelable(true);

                        builder1.setPositiveButton(
                                "Yes",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CreatingPostActivity.this);
                                        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                                        View v = inflater.inflate(R.layout.layout_newplace, null);
                                        EditText editText = (EditText) findViewById(R.id.editText_newplaceName);
                                        alertDialog.setView(v);
                                        alertDialog.setTitle("Add the Name");
                                        alertDialog.show();
                                        dialog.cancel();
                                    }
                                });

                        builder1.setNegativeButton(
                                "No",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CreatingPostActivity.this);
                                        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                                        View v = inflater.inflate(R.layout.layout_listplacesforcheckins, null);
                                        ListView listView = (ListView) v.findViewById(R.id.listView_listcheckins);
                                        ParseQuery<ParseObject> PlacesQuery = new ParseQuery<ParseObject>("Places");

                                    //    Adapter adapter = new Adapter(CreatingPostActivity.this,)
                                      //  listView.setAdapter(adapter);
                                        alertDialog.setView(v);
                                        alertDialog.setTitle("Add the Name");
                                        alertDialog.show();
                                        dialog.cancel();
                                    }
                                });

                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    } catch (Exception e) {
                        Log.e("DIALOG", e.toString());
                    }
                }
            });

        }
        else
        {
            startActivity(new Intent(CreatingPostActivity.this, listplaces.class));
        }

    }
    public void Buttons()
    {
        final EditText place = (EditText) findViewById(R.id.editText_checkin);
        final EditText caption = (EditText) findViewById(R.id.editText_caption);
        Button Post = (Button) findViewById(R.id.button_post);
        Post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseObject post = new ParseObject("Posts");
                String Content  = ParseUser.getCurrentUser().get("Name").toString()+"at\n"+place.getText().toString()+"\n\n\n"+caption.getText().toString();
                post.put("Content",Content);
                startActivity(new Intent(CreatingPostActivity.this,listActivity.class));
            }
        });
    }

}
