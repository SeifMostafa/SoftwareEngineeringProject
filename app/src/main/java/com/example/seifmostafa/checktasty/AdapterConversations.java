package com.example.seifmostafa.checktasty;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import Messaging.Conversation;

/**
 * Created by seifmostafa on 03/01/16.
 */
public class AdapterConversations extends BaseAdapter {
    String[] data;
    LayoutInflater layoutInflater;
    Activity activity;

    public AdapterConversations(Activity activity, String[] data) {
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
        view = layoutInflater.inflate(R.layout.layout_conversation, null);
        TextView conversation = (TextView) view.findViewById(R.id.textView_prev);
        conversation.setText(data[position]);
        return view;
    }
}
