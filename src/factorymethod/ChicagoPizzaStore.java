package factorymethod;

public class ChicagoPizzaStore extends PizzaStore{


    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals(new String(Pizza.CHEESE))){
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("peperoni")){
            pizza = new ChicagoStylePeperoniPizza();
        }
        return pizza;
    }

}
