package decorator;

public class StarrBuzz {

    public static void main (String... args){
        Beverage beverage = new DarkRoast();
        System.out.println( beverage.getDescription() + " " +beverage.cost());


        beverage = new Milk(new Mocha(beverage));
        System.out.println( beverage.getDescription() + " " +beverage.cost());


        beverage = new Espresso();
        System.out.println( beverage.getDescription() + " " + beverage.cost());

        beverage = new Sugar(new Mocha(new Mocha(beverage)));
        System.out.println( beverage.getDescription() + " " + beverage.cost());
    }
}
