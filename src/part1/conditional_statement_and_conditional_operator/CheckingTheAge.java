package part1.conditional_statement_and_conditional_operator;

import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = Integer.parseInt(scanner.nextLine());
        if(age >= 0 && age <= 120){
            System.out.println("Ok");
        }else{
            System.out.println("Impossible!");
        }
    }
}
