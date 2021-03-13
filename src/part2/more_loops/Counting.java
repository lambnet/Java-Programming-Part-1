package part2.more_loops;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        /* this code below using for loops
        for(int i=0; i <= num; i++){
            System.out.println(i);
        }*/
        int i = 0;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
