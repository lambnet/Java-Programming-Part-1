package part1.conditional_statement_and_conditional_operator;

import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        if(num == 1984){
            System.out.println("Orwell");
        }
    }

}
