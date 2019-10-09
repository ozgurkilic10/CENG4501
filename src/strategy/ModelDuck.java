package strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new NoFly();
        // Model duck has no way to fly
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}

