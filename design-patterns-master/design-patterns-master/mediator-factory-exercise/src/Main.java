import Factory.User;
import Factory.UserFactory;
import Mediator.ChatRoom;

public class Main {

    public static void main(String[] args) {

        ChatRoom room = new ChatRoom();

        User ivo = UserFactory.createUser(  room, "user", "ivo");
        User stamen = UserFactory.createUser(room, "user", "stamen");
        User drago = UserFactory.createUser(room, "user", "drago");

        ivo.send("Kak ste gotenqgi?");
        stamen.send("Super sum, ti kak si");
        drago.send("addBot");
        ivo.send("Drago, kakvo e tova?");
        drago.send("Shte moga po-kysno da izlezna");
        ivo.send("parrot");

    }
}
