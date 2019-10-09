package intro;

public class Cylinder {

    double height;

    double radius;


    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    public double volume(){
        return 3*radius*radius*height;

    }

    public double area(){
        return 2*3*radius*radius + 2*3*radius*height;
    }


}
