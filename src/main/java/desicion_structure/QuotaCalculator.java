package desicion_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("How many sales did you made");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();

        if(sales>= quota){
            System.out.println("Congrats! You've met your sales.");
        }else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
        scanner.close();
    }
}
