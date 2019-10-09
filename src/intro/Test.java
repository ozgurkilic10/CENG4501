package intro;

public class Test {


    public static void main (String... args){

        ICircle c = new Circle(5);

        System.out.println("Area of circle = "  + c.area());

        Cylinder2 cy = new Cylinder2(5, 7);

        System.out.println("Ara of intro.Cylinder2" + cy.area());
    }
}
