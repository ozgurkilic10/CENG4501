package simplefactory;

import java.util.List;

public abstract class Pizza {

    public static final String CHEESE = "peynir";

    String name;
    String dough;
    String sauce;
    List<String> toppings;

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
                ", toppings=" + toppings +
                '}';
    }

    public String getName() {
        return name;
    }
}
