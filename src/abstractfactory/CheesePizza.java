package abstractfactory;




import java.util.List;

public class CheesePizza extends Pizza{

    public CheesePizza(PizzaIngredientFactory ingFactory){
       super(ingFactory);
    }
}
