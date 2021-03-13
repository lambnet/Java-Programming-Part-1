package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowertLimit, int upperLimit){
        for(int num : numbers){
            if(num >= lowertLimit && num <= upperLimit){
                System.out.println(num);
            }
        }
    }
}
