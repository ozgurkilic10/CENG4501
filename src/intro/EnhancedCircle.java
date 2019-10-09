package intro;

public class EnhancedCircle implements ICircle{

    double radius;


    public EnhancedCircle(double r){
        super();
        radius = r;
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2* Math.PI*radius;
    }



}
