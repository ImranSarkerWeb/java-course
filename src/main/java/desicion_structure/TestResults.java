package desicion_structure;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("How many number did you get");
        Scanner scanner = new Scanner(System.in);
        double scores = scanner.nextDouble();
        scanner.close();

        char grade;
        if(scores<60){
            grade = 'F';
        } else if (scores<70) {
            grade='D';
        } else if (scores<80) {
            grade = 'C';
        } else if (scores<90) {
            grade= 'B';

        }else {
            grade = 'A';
        }
        System.out.println("Your Grade: "+ grade);
    }
}
