
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++){
            System.out.print("*"); // Printing the number of Stars without line break.
        }

        System.out.println(); // prints line break at the end.
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++){
            System.out.print(" "); // Printing the number of spaces.
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++){
            int spaces = size - i;
            printSpaces(spaces); // Call printSpaces first to print the number of spaces followed by the star(s) with line break.
            printStars(i); // Call printStars() to print the number of Size/Stars or "i" starting with 1 incremeanting to the "size".
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        Boolean basePrint = false; // Defaulted to false until it's changed.

        int stars = 1; // The stars on Top of the tree followed by additional stars after the line break.

        int rows = height; // Need fixed value of height for second loop to build base.

        while (rows > 0){ // Printing tree followed by the base. Similar to printTriangle(). 
            int spaces = rows - 1; // Notice number of spaces are decreased by 2.  With the subtraction of one and row--. Interesting.
            printSpaces(spaces);
            printStars(stars);


            stars += 2;
            rows--;
        }

        basePrint = true; // Set to true so we can print the Base of christmas tree after first part of tree.

        while (basePrint == true) { // Print the base of christmas tree. 3x2
            //System.out.println("This is the base...");

            int baseHeight = 2;

            while (baseHeight > 0){
                int spaces = height - 2;
                printSpaces(spaces);
                printStars(3); // Call printStars with 3 stars wide to print base each loop, twice.
                baseHeight--;
            }

            break;
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
