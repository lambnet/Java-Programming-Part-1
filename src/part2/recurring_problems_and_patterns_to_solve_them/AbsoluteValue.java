package part2.recurring_problems_and_patterns_to_solve_them;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num < 0){
            System.out.println(num * -1);
        }else{
            System.out.println(num);
        }
    }
}
