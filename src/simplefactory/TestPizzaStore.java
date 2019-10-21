package simplefactory;

public class TestPizzaStore {

    public static void main(String... args){
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza =store.orderPizza(Pizza.CHEESE);

        //....
    }
}
