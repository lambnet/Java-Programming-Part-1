package part1.conditional_statement_and_conditional_operator;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        if(num % 2 == 0){
            System.out.println("Number " + num + " is even");
        }else{
            System.out.println("Number " + num + " is odd");
        }
    }
}
