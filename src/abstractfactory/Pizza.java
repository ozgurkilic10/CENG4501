package abstractfactory;

public abstract class Pizza {

    public static final String CHEESE = "peynir";

    String name;
    Dough dough;
    Sauce sauce;
    Veggie veggie;
    Cheese cheese;

    public Pizza(PizzaIngredientFactory ingFactory) {
        this.dough = ingFactory.createDough();
        this.sauce = ingFactory.createSauce();
        this.cheese = ingFactory.createCheese();
    }

    public void prepare(){
        System.out.println("Pizza is prepared");
    }

    public void bake(){
        System.out.println("Pizza is baked");
    }


    public void cut(){
        System.out.println("Pizza is cut");
    }

    public void  box(){
        System.out.println("Pizza is boxed");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggie=" + veggie +
                '}';
    }

    public String getName() {
        return name;
    }
}
