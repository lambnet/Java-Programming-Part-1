package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == -1){
                for(int i=0; i<= myList.size()-1;i++){
                    System.out.println(myList.get(i));
                }
                break;
            }else{
                myList.add(num);
            }
        }
    }
}
