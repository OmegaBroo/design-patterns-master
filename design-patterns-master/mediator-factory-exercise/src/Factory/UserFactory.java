package Factory;

import Mediator.ChatRoom;

public class UserFactory {

    public static User createUser(ChatRoom chatRoom, String type, String name) {
        if (type.equals("user")) {
            return new ChatUser(chatRoom, name);
        }
        if (type.equals("bot")) {
            return new Bot(chatRoom, name);
        }
        return null;
    }
}
