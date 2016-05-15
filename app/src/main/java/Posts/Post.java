package Posts;


import Users.User;

public class Post {
    String post;
    User Owner;

    public Post(String post, User owner) {
        this.post = post;
        Owner = owner;
    }

    public String getPost() {
        return post;
    }

    public User getOwner() {
        return Owner;
    }

    @Override
    public String toString() {
        return Owner.getUsername()+"\n"+post;
    }
}
