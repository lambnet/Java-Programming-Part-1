package part2.more_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        for(int i = num; i>=1; i--){
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
