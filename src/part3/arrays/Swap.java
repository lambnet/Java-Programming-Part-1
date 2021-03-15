package part3.arrays;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 3;
        myArray[2] = 5;
        myArray[3] = 7;
        myArray[4] = 9;

        for(int i=0; i<5;i++){
            System.out.println(myArray[i]);
        }
        System.out.println("Give two indices to swap: ");
        int idx1 = Integer.parseInt(scanner.nextLine());
        int idx2 = Integer.parseInt(scanner.nextLine());
        int temp = myArray[idx1];
        myArray[idx1] = myArray[idx2];
        myArray[idx2] = temp;
        for(int i=0; i<5;i++){
            System.out.println(myArray[i]);
        }

    }
}
