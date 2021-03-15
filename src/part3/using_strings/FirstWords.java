package part3.using_strings;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            }else{
                String[] part = str.split(" ");
                System.out.println(part[0]);
            }
        }
    }
}
