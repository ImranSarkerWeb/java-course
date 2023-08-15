package objects;

public class HomeAreaCalculate {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();
        Rectangle room2 = new Rectangle(75, 55);
        double areaOfRoom2 = room2.calculateArea();

        System.out.println("Area of room 1: " + areaOfRoom1 + "\nArea of room 2: " + areaOfRoom2);
    }
}
