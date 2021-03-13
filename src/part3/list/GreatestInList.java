package part3.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == -1){
                //System.out.println("The greatest number: " + Collections.max(myList));
                int biggest = myList.get(0);
                for(int i=0; i<=myList.size()-1;i++){
                    int a = myList.get(i);
                    if(biggest < a){
                        biggest = a;
                    }
                }
                System.out.println("The greatest number: " + biggest);
                break;
            }else{
                myList.add(num);
            }
        }
    }
}
