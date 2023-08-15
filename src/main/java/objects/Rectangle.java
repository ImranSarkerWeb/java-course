package objects;

public class Rectangle {

    private double width;
    private double height;
    private int sides = 4;
    //convention: Constructors typically appear right after the fields and befor methods

    //no-args constructor(Default Constructor)

    public Rectangle(){
        setWidth(0);
        setWidth(0);
        //no return type or return for constructor
    }

    //all-args or parameterized constructor
    public  Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }


    public double calculatePerimeter(){
        return (2*height) + (2*width);
    }
    public double calculateArea(){
        return height * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
