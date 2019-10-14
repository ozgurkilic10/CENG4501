package decorator;

public class Soy extends CondimentDecorator{

    public Soy(Beverage bev){
        super(bev);
    }

    @Override
    public double cost() {
        return 0.5 + decoratedBeverage.cost();
    }
    public String getDescription(){
        return decoratedBeverage.getDescription() + " with Soy";
    }


}
