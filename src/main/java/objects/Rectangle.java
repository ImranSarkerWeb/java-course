package objects;

public class Rectangle {

    protected double width;
    protected double length;
    protected int sides = 4;
    //convention: Constructors typically appear right after the fields and befor methods

    //no-args constructor(Default Constructor)

    public Rectangle(){
        setWidth(0);
        setLength(0);
        //no return type or return for constructor
    }

    //all-args or parameterized constructor
    public  Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

    public void print(){
        System.out.println("I am a Rectangle");
    }

    public double calculatePerimeter(){
        return (2* length) + (2*width);
    }
    public double calculateArea(){
        return length * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
