package com.example.seifmostafa.checktasty;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class listplaces extends AppCompatActivity {
    ListView lv;
    String [] places = new String []{"Mac","KFC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listplaces);
        lv=(ListView) findViewById(R.id.listView_places);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, places);

        lv.setAdapter(adapter);
        Buttons();
    }
    public  void Buttons()
    {
        Button Rate = (Button)findViewById(R.id.button_sortbyrate);
        Rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(listplaces.this,"no data to sort",Toast.LENGTH_LONG).show();
            }
        });
        Button Near = (Button)findViewById(R.id.button_sortbynear);
        Near.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(listplaces.this,"no data to sort",Toast.LENGTH_LONG).show();
            }
        });
    }

}
