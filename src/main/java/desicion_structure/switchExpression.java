package desicion_structure;

import java.util.Scanner;

public class switchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your grade");

        String grade = scanner.next();

        String message = switch (grade){
            case "A", "B" -> "Wow, Congratulations!";
            // case "B"-> "You are on the way!";
            //We can check two cases at a time(Above)

            case "C" -> {
                // we can write here multiple expression, calculation if needed
                yield "You've done it";
            }

            case "D" -> "Do little bit harder!";
            case"F" -> "Uh oh!";
            default -> "What do you want?";
        };

        System.out.println(message);
        scanner.close();

    }
}
