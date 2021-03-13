package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == -1){
                int sum = 0;
                for(int number : myList){
                    sum += number;
                }
                System.out.println("Sum: " + sum);
                break;
            }else{
                myList.add(num);
            }
        }
    }
}
