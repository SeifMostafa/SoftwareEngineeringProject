package com.example.seifmostafa.checktasty;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class Conversations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversations);
        conversations();
    }
    public  void conversations()
    {
        ListView con = (ListView)findViewById(R.id.listView_conversations);
        // get conversations from server then
        String PrevCon[]=null;


    }
}
