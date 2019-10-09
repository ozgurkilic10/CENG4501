package strategy;

public class DuckSimulator {

    public static void main(String... args){

        Duck mallard = new MallardDuck();

       mallard.display();
       mallard.performQuack();
       mallard.swim();
       mallard.performFly();

        System.out.println();

        mallard.setFlyBehaviour( new NoFly());
        mallard.display();
        mallard.performQuack();
        mallard.swim();
        mallard.performFly();

        System.out.println();
        Duck redHeadDuck = new RedHeadDuck();

        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.swim();
        redHeadDuck.performFly();


        System.out.println();
        Duck rubber = new RubberDuck();

        rubber.display();
        rubber.performQuack();
        rubber.swim();
        rubber.performFly();

        System.out.println();
        Duck decoy = new DecoyDuck();

        decoy.display();
        decoy.performQuack();
        decoy.swim();
        decoy.performFly();
        System.out.println();


        Duck model = new ModelDuck();

        model.display();
        model.performQuack();
        model.swim();
        model.performFly();

        System.out.println();

        model.setFlyBehaviour( new FlyRocketPowered());

        model.display();
        model.performQuack();
        model.swim();
        model.performFly();
    }
}
