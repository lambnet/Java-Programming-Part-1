package part1.calculating_with_numbers;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        int sum = first + second;
        int sub = first - second;
        int mul = first * second;
        double div = (double)first/second;
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + sub);
        System.out.println(first + " * " + second + " = " + mul);
        System.out.println(first + " / " + second + " = " + div);

    }
}
