package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static double requiredSalary = 25000;
    static int requiredCredit = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        double salary = getSalary();
        int credit = getCredit();
        boolean qualified = isQualified(salary, credit);
        notify(qualified);
    }

    private static boolean isQualified(double salary, int credit) {
        return (salary>requiredSalary && credit>requiredCredit);
    }

    public static void notify(boolean qualified){
        if(qualified) System.out.println("Congrats! You've approved.");
        else System.out.println("Sorry, You've declined");
    }


    public static double getSalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return  salary;
    }
    public static int getCredit(){
        System.out.println("Enter your credit");
        int credit = scanner.nextInt();
        return  credit;
    }
}
