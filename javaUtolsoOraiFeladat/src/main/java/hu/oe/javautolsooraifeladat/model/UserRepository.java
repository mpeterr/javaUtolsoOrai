package hu.oe.javautolsooraifeladat.model;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users = new ArrayList<>();

    public UserRepository() {
    }

    public User findUser(String login){
        for (User user :
                users) {
            if (user.getUsername().equals(login)) return user;
        }
        return null;
    }

    public void addUser(User newUser){ users.add(newUser); }
}
