package Messaging;
import Users.User;
import Messaging.Messaging;
import java.util.ArrayList;

public class Conversation {
	private int ID;
	private ArrayList<Messaging> messages = new ArrayList<Messaging>();
	public ArrayList<User> users = new ArrayList<User>();
	private int numberOfMessages=0;
	
public void addMessage(Messaging msg) {
	messages.add(msg);
	numberOfMessages++;
	}
public void removeMessage(){
	messages.remove(0);
	numberOfMessages--;
}
public void addUser (User _user){
	users.add(_user);
}
public int getNumberOfMessages() {
	return numberOfMessages;
}
public void setNumberOfMessages(int numberOfMessages) {
	this.numberOfMessages = numberOfMessages;
}
public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

	
	
};
