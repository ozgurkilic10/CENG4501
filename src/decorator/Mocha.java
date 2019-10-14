package decorator;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage bev){
        super(bev);
        description = "Mocha";
    }


    @Override
    public double cost() {
        return 2 + decoratedBeverage.cost();
    }
    public String getDescription(){
        return decoratedBeverage.getDescription() + " with " + description;
    }


}
