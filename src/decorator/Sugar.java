package decorator;

public class Sugar extends CondimentDecorator{

    public Sugar(Beverage bev){
        super(bev);
    }

    @Override
    public double cost() {
        return 0.5 + decoratedBeverage.cost();
    }
    public String getDescription(){
        return decoratedBeverage.getDescription() + " with Sugar";
    }

}
