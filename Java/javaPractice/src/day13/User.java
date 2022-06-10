package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }


    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }


    public boolean isFriend(User user) {
        return subscriptions.contains(user) && user.subscriptions.contains(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) && subscriptions.equals(user.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, subscriptions);
    }


    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
