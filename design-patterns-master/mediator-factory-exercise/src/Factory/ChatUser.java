package Factory;

import Mediator.ChatRoom;

public class ChatUser extends User {

    public ChatUser(ChatRoom chatRoom, String name) {
        super(chatRoom, name);
        chatRoom.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.getName() + " sent:  " + message);
        chatRoom.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.getName() + " received:  " + message);
    }
}
