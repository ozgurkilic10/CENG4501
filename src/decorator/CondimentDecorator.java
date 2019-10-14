package decorator;

public abstract class CondimentDecorator extends Beverage {

    Beverage decoratedBeverage;

    public CondimentDecorator(Beverage bev){
        decoratedBeverage = bev;
    }

    public abstract String getDescription();


}
