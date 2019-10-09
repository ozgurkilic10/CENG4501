package intro;

public class Cylinder3 {

    double height;

   ICircle circle;

    public Cylinder3(ICircle c, double h){

        height = h;
        circle =c;
    }

    public double volume(){
        return circle.area()*height;

    }

    public double area(){

        return 2* circle.area()+ circle.perimeter()*height;
    }


}
