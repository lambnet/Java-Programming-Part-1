package part2.methodanddividingtheprogram;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int num = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<num; i++){
            printText();
        }
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
}
