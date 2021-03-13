package part2.repeating_functionality;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posCount = 0;
        int posSum = 0;
        double avg = 0;
        while (true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                if(posSum != 0){
                    System.out.println(avg);
                    break;
                }
                System.out.println("Cannot calculate the average");
                break;
            }
            if(num > 0){
                posCount += 1;
                posSum += num;
                avg = (double)posSum/posCount;
                continue;
            }
        }
    }
}

