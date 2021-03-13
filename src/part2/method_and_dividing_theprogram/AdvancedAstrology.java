package part2.method_and_dividing_theprogram;

public class AdvancedAstrology {
    public static void main(String[] args) {

        christmasTree(10);
    }
    public static void printStars(int number){
        while(number != 0){
            System.out.print("*");
            number--;
        }
        System.out.println();
    }
    /* Part 1: Printing stars and spaces */
    public static void printSpaces(int number){
        while(number != 0){
            System.out.print(" ");
            number--;
        }
    }
    /* Part 2: Printing a right-learning triangle */
    public static void printTriangle(int size){
        for(int i=1; i<=size; i++){
            printSpaces(size-i);
            printStars(i);

        }
    }
    /* Part 3: Printing a Christmas tree */
    public static void christmasTree(int height){
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i + (i - 1));
            i++;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);

    }
}
