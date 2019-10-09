package strategy;

public class RedHeadDuck extends Duck{


    public RedHeadDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display(){

        System.out.println(" Hey I am a red head duck");
    }


}
