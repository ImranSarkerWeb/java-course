package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args){
        System.out.println("How many product do you sale");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;
        for(int i = 0; i<quantity; i++){
            System.out.println("Item number " + (i+1) + " price: ");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("Total price: " + total);
        scanner.close();

    }
}
