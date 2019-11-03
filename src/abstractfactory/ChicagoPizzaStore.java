package abstractfactory;



public class ChicagoPizzaStore extends PizzaStore {


    public ChicagoPizzaStore() {
        ingFactory = new ChicagoPizzaIngredientFctory();
    }

    public void scheduleDelivery(){
        System.out.println("Delivery scheduled");
    }




}
