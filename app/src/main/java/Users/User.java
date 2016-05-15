package Users;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.SignUpCallback;

import java.util.ArrayList;

import Notifications.Notification;
import Posts.Post;

@ParseClassName("User")
public class User extends ParseObject {
	String username;
	String Email;
	String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	public User ()
	{

	}
	ArrayList<Notification> notifications = new ArrayList<Notification>();
	ArrayList<String> tastes = new ArrayList<String>();
	ArrayList<Post> posts = new ArrayList<Post>();
	ArrayList<User> friends = new ArrayList<User>();


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void AddNewFriend(User friend)
	{
		this.friends.add(friend);
	}
	
	public void AddNewTaste(String Taste)
	{
		this.tastes.add(Taste);
	}


}
