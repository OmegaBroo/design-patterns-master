package commands;

public class Exercise {

    private boolean isUp;

    public String getUp() {
        System.out.println("Exercise is getting up.");
        this.isUp = true;
        return "get up";
    }

    public String layDown() {
        System.out.println("Exercise is laying down.");
        this.isUp = false;
        return "lay down";
    }
}
