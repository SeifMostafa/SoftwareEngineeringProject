package Notifications;

import java.util.ArrayList;

import Posts.Post;
import Users.User;

public class Comment extends Notification{


	User CommentOwner ;
	Post postcommented ; 
	String Comment ;
	
	/*public Comment(User commentOwner, Post postcommented, String comment) {
		CommentOwner = commentOwner;
		this.postcommented = postcommented;
		Comment = comment;
	}*/
	@Override
	public String toString() {
		return CommentOwner.getUsername() + " Commented on " +postcommented +" by "+Comment ;
	}
	

}
