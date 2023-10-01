package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args){
        int payRate = 50;
        int maxHours = 40;

        System.out.println("How many hours did you work ");
        Scanner scanner = new Scanner(System.in);
        double workedHours = scanner.nextDouble();

        while((workedHours > maxHours) || (workedHours < 0)){
            System.out.println("You have exceed your working hour. Please enter between 0 and 40.");
            workedHours = scanner.nextDouble();
        }
        double grossPay = workedHours * payRate;
        System.out.println("Gross pay " + grossPay);


        scanner.close();
    }
}
