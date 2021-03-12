package part1.conditional_statement_and_conditional_operator;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "Caput Draconis";
        System.out.println("Password?");
        String input = scanner.nextLine();
        if (input.equals(password)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
