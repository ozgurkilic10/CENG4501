package abstractfactory;

public class NYPizzaIngredientFctory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie createVeggie() {
        return new Garlic();
    }
}
