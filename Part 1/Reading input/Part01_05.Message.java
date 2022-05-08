// Scanner tool for reading user input is imported here
import java.util.Scanner; 

public class Message {
    public static void main(String[] args) {


        // Create a tool for reading user input and name it scanner
        try(Scanner scanner = new Scanner(System.in)){
            //code

            // Print "Write a message: "
            System.out.println("Write a message:");

            // Read the string written by the user, then assign it
            // to program memory or string variable "String message = (string that was given as input)"
            String message = scanner.nextLine();

            // Print the message written by the user
            System.out.println(message);
        }


    }

}
