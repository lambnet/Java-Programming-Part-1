package part1.conditional_statement_and_conditional_operator;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.parseInt(scanner.nextLine());
        if(first > second){
            System.out.println("Greater number is:" + first);
        }else if (second > first){
            System.out.println("Greater number is: " + second);
        }else{
            System.out.println("The numbers are equal!");
        }
    }
}
