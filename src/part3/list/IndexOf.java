package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == -1){
                System.out.print("Search for? ");
                int input = Integer.parseInt(scanner.nextLine());
                for(int i=0; i<=myList.size()-1;i++){
                    if(myList.get(i) == input){
                        System.out.println(input + " is at index "+ i);
                    }
                }
                break;
            }else{
                myList.add(num);
            }
        }
    }
}
