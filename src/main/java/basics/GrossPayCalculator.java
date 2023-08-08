package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double payRate = scanner.nextDouble();

        double grossPay = hours * payRate;

        scanner.close();
        System.out.println("Gross pay " + grossPay);

    }
}
