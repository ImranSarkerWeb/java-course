package objects;

import java.util.Scanner;

public class HomeAreaCalculateRedo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //create an instance of the class called HomeAreaCalculateRedo to call non-static method in static method
        HomeAreaCalculateRedo calculator = new HomeAreaCalculateRedo();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();
        double totalArea = calculator.calculateAreaOfRoom(room1, room2);
        System.out.println("The total area of two rooms: " + totalArea);
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();
        //return a class from a method

        return  new Rectangle(width, length);
    }

    //create a method which will take parameter as an object
    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
