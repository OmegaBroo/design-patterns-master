import Factory.User;
import Factory.UserFactory;
import Mediator.ChatRoom;

public class Main {

    public static void main(String[] args) {

        ChatRoom room = new ChatRoom();

        User goshko = UserFactory.createUser(  room, "user", "Goshko");
        User radko = UserFactory.createUser(room, "user", "Radko");
        User peshko = UserFactory.createUser(room, "user", "Peshko");

        goshko.send("Kak ste momcheta?");
        radko.send("Dobre brat ti kak si?");
        peshko.send("addBot");
        goshko.send("Pesho kakvo e tova be bratle");
        peshko.send("Супер съм, вие как сте?");
        goshko.send("Добре");

    }
}
