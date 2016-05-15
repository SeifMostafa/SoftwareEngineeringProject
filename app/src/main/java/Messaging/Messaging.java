package Messaging;

import java.util.ArrayList;

import Users.User;

public class Messaging {
private int conversationID;
private User sender;
private ArrayList<User>recivers=new ArrayList<User>();
private String bodyOfMessage;
public void send(String msg){
bodyOfMessage=msg;
/*for(int i=0;i<Database.allConversations.size();i++){
	if(Database.allConversations.get(i).getID()==conversationID){
		Database.allConversations.get(i).addMessage(this);
		int temp=Database.allConversations.indexOf(Database.allConversations.get(i));
		if(Database.allConversations.get(i).getNumberOfMessages()==30) 
			Database.allConversations.get(i).removeMessage();
		Database.updateConversation(this,temp,conversationID);
		break;
	}
}*/

}
public void addReciver(User reciver){
	recivers.add(reciver);
}
public User getSender() {
	return sender;
}
public void setSender(User sender) {
	this.sender = sender;
}
public String getBodyOfMessage() {
	return bodyOfMessage;
}
public void setBodyOfMessage(String bodyOfMessage) {
	this.bodyOfMessage = bodyOfMessage;
}
}
