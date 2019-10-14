package decorator;

public class Whip extends CondimentDecorator{

    public Whip(Beverage bev){
        super(bev);
    }


    @Override
    public double cost() {
        return 0.75 + decoratedBeverage.cost();
    }
    public String getDescription(){
        return decoratedBeverage.getDescription() + " with Whip";
    }


}
