package part2.repeating_functionality;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }else{
                count += 1;
                sum += num;
                continue;
            }
        }
    }
}
