package part3.list;

import java.util.ArrayList;
import java.util.Scanner;


public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                System.out.println(myList.get(1) + myList.get(2));
                break;
            }else{
                myList.add(num);
            }
        }
    }
}
