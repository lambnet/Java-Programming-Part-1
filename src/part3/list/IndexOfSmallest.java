package part3.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 9999){
                /* Only print the first occurences
                System.out.println("Smallest number: " + Collections.min(myList));
                System.out.println("Found at index: " + myList.indexOf(Collections.min(myList)));
                */
                int smallest = myList.get(0);
                for(int i = 0; i<=myList.size()-1;i++){
                    int a = myList.get(i);
                    if(smallest > a){
                        smallest = a;
                    }
                }
                System.out.println("Smallest number: " + smallest);
                for(int i=0; i<=myList.size()-1;i++){
                    if(myList.get(i) == smallest){
                        System.out.println("Found at index "+ i);
                    }
                }
                break;
            }
            else{
                myList.add(num);
            }
        }
    }
}
