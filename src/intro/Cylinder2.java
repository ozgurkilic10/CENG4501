package intro;

public class Cylinder2 extends  Circle{

    double height;

    public Cylinder2(double r, double h){
        super(r);
        height = h;
    }

    public double volume(){
        return super.area()*height;

    }

  public double area(){
        return 2*super.area() +super.perimeter()*height;
    }


}
