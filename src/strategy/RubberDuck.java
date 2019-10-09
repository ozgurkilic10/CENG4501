package strategy;

public class RubberDuck extends Duck{


    public RubberDuck(){
        flyBehaviour = new NoFly();
        quackBehaviour = new Squeak();
    }

    public void display(){

        System.out.println(" Hey I am a red rubber duck");
    }


}
