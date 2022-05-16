
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter first number.");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        //System.out.println("Enter second number.");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        int sumOfTwoNumber = firstNumber + secondNumber;

        double squareRoot = Math.sqrt(sumOfTwoNumber);

        System.out.println(squareRoot);

    }
}
