package part1.calculating_with_numbers;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds? ");
        int num = Integer.parseInt(scanner.nextLine());
        int daysInSec = num * 86400;
        System.out.println(daysInSec);

    }
}
