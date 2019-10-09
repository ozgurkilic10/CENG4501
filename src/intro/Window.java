package intro;

public class Window {

    Rectangle rect;

    public Window(int height, int width){
        rect = new Rectangle(height, width);


    }

    public int area(){
        return rect.area();
    }

}
