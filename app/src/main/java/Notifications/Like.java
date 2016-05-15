package Notifications;

import java.util.ArrayList;

import Posts.Post;
import Users.User;

public class Like extends Notification{


	Post postliked;
	
	public Like(User likeOwner, Post postliked) {
		this.postliked = postliked;
		this.from = likeOwner;
		//this.To = postlikes.user;
		this.read = false;
		this.about = this.toString();	
	}
	@Override
	public String toString() {
		return  from.getUsername() + " liked "+postliked;
	}
	
	
	
}
