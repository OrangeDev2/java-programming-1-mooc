
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = 0;
        int sumOfNumbers    = 0;

        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0){
                break;
            }

            inputs = inputs + 1;
            sumOfNumbers = sumOfNumbers + number;
        }

        // Print when loop is exited.
        System.out.println("Number of numbers: " + inputs);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
        
    }
}
