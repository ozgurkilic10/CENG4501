package abstractfactory;


import java.util.List;

public class VeggiePizza extends Pizza{

    public VeggiePizza(PizzaIngredientFactory ingFactory){
        super(ingFactory);
        veggie = ingFactory.createVeggie();
    }
}
