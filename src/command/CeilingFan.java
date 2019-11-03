package command;

public class CeilingFan {

    String speed = "low";
    public void low(){
        System.out.println("Setting the level to low");
        speed = "low";
    }

    public void medium(){
        System.out.println("Setting the level to medium");
        speed = "medium";
    }
    public void high(){
        System.out.println("Setting the level to high");
        speed = "high";
    }
    public void off(){
        System.out.println("Turning off ceiling fan");
        speed = "none";
    }

    public String getSpeed(){
        return speed;
    }
}
