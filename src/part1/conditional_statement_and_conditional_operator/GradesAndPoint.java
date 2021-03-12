package part1.conditional_statement_and_conditional_operator;

import java.util.Scanner;

public class GradesAndPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int point = Integer.parseInt(scanner.nextLine());
        if(point < 0){
            System.out.println("impossible!");
        } else if(point >= 0 && point <= 49){
            System.out.println("Grade: failed");
        } else if(point >= 50 && point <= 59){
            System.out.println("Grade: 1");
        } else if(point >= 60 && point <= 69){
            System.out.println("Grade: 2");
        } else if(point >= 70 && point <= 79){
            System.out.println("Grade: 3");
        }else if(point >= 80 && point <= 89){
            System.out.println("Grade: 4");
        }else if(point >= 90 && point <= 100){
            System.out.println("grade: 5");
        }else {
            System.out.println("Grade: incredible!");
        }
    }
}
