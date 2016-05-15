package com.example.seifmostafa.checktasty;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Tastes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tastes);

    }
    public void Buttons()
    {
        Button Add = (Button)findViewById(R.id.button_addtaste);
        final EditText newTaste = (EditText)findViewById(R.id.editText_newTaste);
        final ListView listView = (ListView)findViewById(R.id.listView_tastes);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] tastes =null;
                // get data from server
                tastes[tastes.length]=newTaste.getText().toString();
                TastesAdapter adapter = new TastesAdapter(Tastes.this,tastes);
                listView.setAdapter(adapter);
            }
        });
    }
}
