package simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals(new String(Pizza.CHEESE))){
            pizza = new CheesePizza();
        }else if(type.equals("peperoni")){
            pizza = new PeperoniPizza();
        }else if (type.equals("vegetable")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
