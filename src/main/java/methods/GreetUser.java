package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name = getName();
        greetUser(name);

    }

    public static String getName(){
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return  name;
    }

    public static  void greetUser(String name){
        System.out.println("Hello " + name + "!");
    }
}
