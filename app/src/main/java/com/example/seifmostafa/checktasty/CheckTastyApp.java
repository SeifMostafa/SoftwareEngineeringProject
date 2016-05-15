package com.example.seifmostafa.checktasty;

import com.parse.Parse;
import com.parse.ParseObject;

import Users.User;

/**
 * Created by seifmostafa on 31/12/15.
 */
public class CheckTastyApp extends android.app.Application {
    String APPLICATION_ID ="b3E7HZD4zv5YbWqAmJ0ZuPIZi4qzzDyUsX047J8f",CLIENT_KEY= "3MIfpxOvHfTiZZulSTIFXOes3gmaBkuUp2BhCaUT";

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(User.class);


        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
    }
}
