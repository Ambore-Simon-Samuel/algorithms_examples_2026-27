package utils;

import java.util.Scanner;

public class InputUtility {

    public static int getValidInteger(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }

}