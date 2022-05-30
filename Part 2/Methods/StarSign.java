
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(4);
        //printStars(4);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 1; i <= number; i++){
            System.out.print("*"); // Printing the number of Stars without line break.

            if (i == number){ // prints line break at the end.
                System.out.println();
            }
        }
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int caller = size; // the number of times printStars will be called.

        while (caller > 0){
            printStars(size); // printStars() is called with the number of Stars in a line.
            caller--;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int caller = height; // the number of times printStars will be called.

        while (caller > 0){
            printStars(width); // printStars() is called with the number of Stars in a line.
            caller--;
        }

    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i <= size; i++){
            printStars(i); // printStars() is called with the number of Size or "i" starting with 1 incremeanting to the "size"
        }
    }
}
