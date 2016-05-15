package Notifications;

import java.util.ArrayList;

import Users.User;

public class Notification {
	User from;
	ArrayList<User> To;
	String about;
	boolean read=false;

	
	public void update(boolean readDONE)
	{
		if (readDONE == true) {
			read = true;
		} else
			read = false;
	}


	@Override
	public String toString() {
		return about;
	}

	
}
