
import java.util.Scanner;

/* Example:

I will tell you a story, but I need some information first.

What is the main character called?
input: Ada

What is their job?
input: a Data scientist

Here is the story:
Once upon a time there was Ada, who was a Data scientist.
On the way to work, Ada reflected on life.
Perhaps Ada will not be a Data scientist forever.

*/

public class Story {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            // Write your program here
            System.out.println("I will tell you a story, but I need some information first.");
            System.out.println("What is the main character called?");
            String first = scanner.nextLine();

            System.out.println("What is their job?");
            String second = scanner.nextLine();

            System.out.println("Here is the story:");
            System.out.println("Once upon a time there was " + first + ", who was " + second + ".");
            System.out.println("On the way to work, " + first + " reflected on life.");
            System.out.println("Perhaps " + first + " will not be " + second + " forever.");
        }

        
    }
}
