package part1.conditional_statement_and_conditional_operator;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        if (num > 0){
            System.out.println("The number is positive.");
        }else {
            System.out.println("The number is not positive.");
        }
    }
}
