package part1.variables;

import java.util.Scanner;

public class VariousVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chicken: ");
        int chicken = Integer.parseInt(scanner.nextLine());
        System.out.println("Bacon (kg): ");
        double bacon = Double.parseDouble(scanner.nextLine());
        System.out.println("Tractor: ");
        String tractor = scanner.nextLine();
        System.out.println("And finally, a summary:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);
    }
}
