package Notifications;

import java.util.ArrayList;

import Users.User;

 enum response {Accept,Refuse};
public class FriendRequest extends Notification{
	public FriendRequest(User from, ArrayList<User> to, String about) {
		this.from = from;
		this.To = to;
		this.read = false;
		this.about = this.toString();
	}

	boolean Response=false;
	
	public void verifyResponse(response r)
	{
		if(r==response.Accept)Response= true;
		else Response=false;
	}

	@Override
	public String toString() {
		return this.from.getUsername() +" asks to be your friend ";
	}
	
}
