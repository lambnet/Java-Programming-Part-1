package part1.calculating_with_numbers;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        double res = (first + second)/2.0;
        System.out.println("The average is " + res);
    }
}
