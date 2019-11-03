package abstractfactory;



public class NYPizzaStore extends PizzaStore {


    public NYPizzaStore() {
        ingFactory = new NYPizzaIngredientFctory();
    }

    public void scheduleDelivery(){
        System.out.println("Delivery scheduled");
    }



    @Override
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
