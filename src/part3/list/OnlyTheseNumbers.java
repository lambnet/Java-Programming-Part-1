package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == -1){
                System.out.print("From where? ");
                int start = Integer.parseInt(scanner.nextLine());
                System.out.print("To where? ");
                int stop = Integer.parseInt(scanner.nextLine());
                for(int i = start; i<=stop; i++){
                    System.out.println(myList.get(i));
                }
                break;
            }else{
                myList.add(num);
            }
        }
    }
}
