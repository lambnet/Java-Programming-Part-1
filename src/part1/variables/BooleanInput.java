package part1.variables;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        boolean msg = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("True or false? " + msg);

    }
}
