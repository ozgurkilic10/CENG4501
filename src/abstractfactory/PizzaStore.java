package abstractfactory;


public abstract class PizzaStore {


    PizzaIngredientFactory ingFactory;

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        if (pizza == null){
            return pizza;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals(new String(Pizza.CHEESE))){
            pizza = new CheesePizza(ingFactory);
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(ingFactory);
        }

        return pizza;
    }
}
