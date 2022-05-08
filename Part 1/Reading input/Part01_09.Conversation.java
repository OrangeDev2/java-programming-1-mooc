
import java.util.Scanner;

/*
Greetings! How are you doing?
Good thank you!
Oh, how interesting. Tell me more!
Well, there's really nothing to tell.
Thanks for sharing!
*/
public class Conversation {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            // Write your program here

            System.out.println("Greetings! How are you doing?");
            String first = scanner.nextLine();

            System.out.println("Oh, how interesting. Tell me more!");
            String second = scanner.nextLine();

            System.out.println("Thanks for sharing!");
        }

        

    }
}
