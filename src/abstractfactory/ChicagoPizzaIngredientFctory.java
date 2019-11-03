package abstractfactory;

public class ChicagoPizzaIngredientFctory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new PermasanCheese();
    }

    @Override
    public Veggie createVeggie() {
        return new Garlic();
    }
}
