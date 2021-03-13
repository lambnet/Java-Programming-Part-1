package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                System.out.print("Search for? ");
                String find = scanner.nextLine();
                if(myList.contains(find)){
                    System.out.println(find + " was found!");
                }else{
                    System.out.println(find + " was not found!");
                }
                break;
            }else{
                myList.add(str);
            }
        }
    }
}
