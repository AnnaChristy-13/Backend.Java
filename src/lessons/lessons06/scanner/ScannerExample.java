package lessons06.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter text message: ");
        String textMessage = scanner.nextLine();
        System.out.println("Your text is: " + textMessage);

        System.out.println("Please enter integer number: ");
        int intNumber = scanner.nextInt();
        System.out.println("Your number is: " + intNumber);

        System.out.println("Please enter double number: ");
        double doubleNumber = scanner.nextDouble();
        System.out.println("Your number is: " + doubleNumber);

        System.out.println("Please enter true or false: ");
        boolean booleanNumber = scanner.nextBoolean();
        System.out.println("Your is it true : " + booleanNumber);


        scanner.close();
    }
}
