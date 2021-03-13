package part2.recurring_problems_and_patterns_to_solve_them;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double res = Math.sqrt(num1+num2);
        System.out.println(res);
    }
}
