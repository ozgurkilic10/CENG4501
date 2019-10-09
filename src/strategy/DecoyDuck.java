package strategy;

public class DecoyDuck extends Duck{


    public DecoyDuck(){
        quackBehaviour = new Mute();
        flyBehaviour = new NoFly();
    }

    public void display(){

        System.out.println(" Hey I am a red decoy duck");
    }

}
