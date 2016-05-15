package com.example.seifmostafa.checktasty;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        Buttons();
        ListView listView= (ListView)findViewById(R.id.listView_notifications);
        String [] data = {"Like","Comment"};
       AdapterNotifications adapterNotifications = new AdapterNotifications(Notifications.this,data);
        listView.setAdapter(adapterNotifications);
    }
    public void Buttons()
    {
        Button clearall = (Button)findViewById(R.id.button_clear);
        clearall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notifications.this,"Yup , we are removing",Toast.LENGTH_LONG).show();

            }
        });
    }

}
