package part3.using_strings;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if(!str.equals("")){
                String[] words = str.split(" ");
                for(String part : words ){
                    if(part.contains("av")){
                        System.out.println(part);
                    }
                }
            }else{
                break;
            }
        }

    }
}
