package part1.calculating_with_numbers;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.parseInt(scanner.next());
        int res = first + second;
        System.out.println("The sum of number is " + res);
    }
}
