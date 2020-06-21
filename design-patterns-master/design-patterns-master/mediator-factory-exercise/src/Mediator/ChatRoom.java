package Mediator;

import Factory.Bot;
import Factory.User;
import Factory.UserFactory;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private List<User> users;
    private Bot bot;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
        System.out.println(user.getName() + " has been added.");
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }

        if(message.equals("addBot") && bot == null){
            this.bot = (Bot) UserFactory.createUser(this, "bot", "catBot");
            this.sendMessage("Cat bot added!", null);
        }

        if(message.contains("cat") && bot != null) {
            this.removeUser(user);
            this.bot.send(user.getName() + " got removed for typing a forbidden word!");
            return;
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }
}
