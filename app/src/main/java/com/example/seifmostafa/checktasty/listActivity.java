package com.example.seifmostafa.checktasty;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import Posts.Post;
import Users.User;

public class listActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Buttons();




    }

   public void Buttons()
   {
       Button ADDPOST = (Button)findViewById(R.id.button_addpost);
       ADDPOST.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               startActivity(new Intent(listActivity.this, CreatingPostActivity.class));
           }
       });
       Button REFRESH = (Button)findViewById(R.id.button_refresh);
       REFRESH.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ParseObject parseObject = new ParseObject("User");
             //  Log.i("TESTPARSEOBJECT",parseObject.toString().trim());
           }
       });
   }
    public void Retriveposts()
    {
        // retrive posts from server
        ParseQuery posts = ParseQuery.getQuery("Posts");
        posts.whereEqualTo("Owner", ParseUser.getCurrentUser());
        posts.include("Owner");

      /*  ListView post = (ListView)findViewById(R.id.listView_posts);
        Adapter adapter = new Adapter(listActivity.this,POSTS);
        post.setAdapter(adapter);*/
    }













    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        boolean type = true;        // normal and false will represent the premium.
        if(!ParseUser.getCurrentUser().get("CreditNumber").toString().trim().equals(""))
        {
            type=false;
        }
        if (id == R.id.action_upgrade)
        {
            if(type)
            {
                startActivity(new Intent(listActivity.this,Upgrade.class));
            }
            else
            {
                Toast.makeText(listActivity.this,"You already Premium Account",Toast.LENGTH_LONG).show();
            }
            return true;
        }
        if(id == R.id.action_verifycard)
        {
            if(type)
            {
                Toast.makeText(listActivity.this, "You haven't access .. Upgrade your Account first.", Toast.LENGTH_LONG).show();
            }
            else
            {
                startActivity(new Intent(listActivity.this, Upgrade.class));
            }
            return true;
        }
        if (id == R.id.action_logout) {
            ParseUser.logOut();
            startActivity(new Intent(listActivity.this,LoginActivity.class));
            return true;
        }
        if(id== R.id.action_friends)
        {
            startActivity(new Intent(listActivity.this,friendsActivity.class));
            return true;
        }
        if(id==R.id.action_places)
        {
            startActivity(new Intent(listActivity.this,listplaces.class));
            return true;
        }
        if(id==R.id.action_messages)
        {
            startActivity(new Intent(listActivity.this,Conversations.class));
            return true;
        }
        if(id==R.id.action_Notifications)
        {
        startActivity(new Intent(listActivity.this,Notifications.class));
            return true;
        }
        if(id == R.id.action_Tastes)
        {
            startActivity(new Intent(listActivity.this,Tastes.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
