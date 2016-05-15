package com.example.seifmostafa.checktasty;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by seifmostafa on 28/12/15.
 */
public class Adapter extends BaseAdapter {
    String[] data;
    LayoutInflater layoutInflater;
    Activity activity;

    public Adapter(Activity activity, String[] data) {
        this.data = data;
        this.activity = activity;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = convertView;
        view = layoutInflater.inflate(R.layout.layout_post, null);
        TextView post = (TextView) view.findViewById(R.id.textView_post);
        post.setText(data[position]);
        return view;
    }

}
