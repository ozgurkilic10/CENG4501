package strategy;

public abstract class Duck {

    Flyable flyBehaviour;
    Quackable quackBehaviour;


    public void swim(){
        System.out.println("I am swimming");
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(Flyable fl){
        flyBehaviour = fl;
    }
}
