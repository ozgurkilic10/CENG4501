package intro;

public class Circle implements ICircle{

    double radius;


    public Circle (double r){
        super();
        radius = r;
    }

    public double area(){
        return 3*radius*radius;
    }

    public double perimeter(){
        return 2*3*radius;
    }



}
