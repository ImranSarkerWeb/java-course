package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("How much your hourly rate?");
        double payRate = scanner.nextDouble();

        scanner.close();
        double grossPay = hours* payRate;
        System.out.println("Gross Pay " + grossPay);

 }
}
