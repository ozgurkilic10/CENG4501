package decorator;

public class Milk extends CondimentDecorator{

    public Milk(Beverage bev){
        super(bev);
    }

   @Override
    public double cost() {
        return 1 + decoratedBeverage.cost();
    }

    public String getDescription(){
        return decoratedBeverage.getDescription() + " with Milk";
    }


}
