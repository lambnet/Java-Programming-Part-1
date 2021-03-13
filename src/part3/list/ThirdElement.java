package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            }else{
                myList.add(str);
            }
        }
        System.out.println(myList.get(2));
    }

}
