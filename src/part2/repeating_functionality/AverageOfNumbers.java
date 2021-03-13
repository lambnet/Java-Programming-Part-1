package part2.repeating_functionality;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        int count = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                System.out.println("Average of the number: " + avg);
                break;
            }else{
                count += 1;
                sum += num;
                avg = (double)sum/count;
                continue;
            }
        }
    }
}
