package part1.variables;

import java.util.Scanner;

public class DifferentTypesofInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.parseInt(scanner.nextLine());
        System.out.println("Give a double: ");
        double aDouble = Double.parseDouble(scanner.nextLine());
        System.out.println("Gie a boolean:");
        boolean aBoolean = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + aDouble);
        System.out.println("You gave the boolean " + aBoolean);
    }
}
