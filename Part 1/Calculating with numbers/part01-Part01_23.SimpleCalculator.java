
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        System.out.println(String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber) + " = " + (firstNumber + secondNumber));
        System.out.println(String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber) + " = " + (firstNumber - secondNumber));
        System.out.println(String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber) + " = " + (firstNumber * secondNumber));
        System.out.println(String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber) + " = " + (1.0 * firstNumber / secondNumber));

    }
}
