package factorymethod;

public class NYPizzaStore extends PizzaStore{


    public void scheduleDelivery(){
        System.out.println("Delivery scheduled");
    }



    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals(new String(Pizza.CHEESE))){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("peperoni")){
            pizza = new NYStylePeperoniPizza();
        }

        return pizza;
    }
}
