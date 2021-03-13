package part2.more_loops;

import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /*Part 1: Where To*/
        System.out.print("Where to? ");
        int num1 = Integer.parseInt(scanner.nextLine());
        //for(int i=1; i<=num; i++){
        //    System.out.println(i);
        //}

        /*Part 2: Where From*/
        System.out.print("Where from? ");
        int num2 = Integer.parseInt(scanner.nextLine());
        for(int i = num2; i <= num1; i++){
            System.out.println(i);
        }
    }
}
