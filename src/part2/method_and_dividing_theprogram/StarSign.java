package part2.method_and_dividing_theprogram;

public class StarSign {
    public static void main(String[] args) {
        printTriangle(4);
    }
    /* Part 1: Printing stars */
    public static void printStars(int number){
        while(number != 0){
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    /* Part 2: Printing a square */
    public static void printSquare(int size){
        for(int i=1; i<=size; i++){
            printStars(size);
        }
    }

    /* Part 3: Printing a rectangle */
    public static void printRectangle(int width, int height){
        for(int i=1; i<=height; i++){
            printStars(width);
        }
    }

    /* Part 4: Pringint a triangle */
    public static void printTriangle(int size){
        for(int i=1; i<=size; i++){
            printStars(i);
        }
    }



}
