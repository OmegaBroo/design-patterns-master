package Factory;

import Mediator.ChatRoom;

public abstract class User {

    protected ChatRoom chatRoom;
    private String name;

    public User(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
