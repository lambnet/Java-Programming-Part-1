package part3.arrays;

import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = {6,2,8,1,3,0,9,7};

        System.out.print("Search for? ");
        int num = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == num){
                System.out.println(num+" is at index " + i);
                found = true;
            }
        }
        if(!found){
            System.out.println("Not found");
        }

    }
}
