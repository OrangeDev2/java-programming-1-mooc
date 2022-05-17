
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0 && sum > 0){
                double average = 1.0 * sum/count;
                System.out.println("Average of the numbers: " + average);

                break;
            } else if (number == 0){
                System.out.println("Cannot calculate the average.");
                break;
            }

            if (number > 0){
                sum = sum + number;
                count = count + 1;
            }
        }

        // After loop exit.
        /*double average = 1.0 * sum/count;
        System.out.println("Average of the numbers: " + average);*/
    }
}
