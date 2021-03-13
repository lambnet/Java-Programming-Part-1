package part2.more_loops;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int lastNum = Integer.parseInt(scanner.nextLine());
        //int res = lastNum * (lastNum+1)/2;
        int sum = 0;
        for(int i = 1; i <= lastNum; i++){
            sum += i;
        }
        System.out.println("The sum is " + sum);

    }
}
