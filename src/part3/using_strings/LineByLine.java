package part3.using_strings;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(!str.equals("")){
            String[] words = str.split(" ");
            for(String part : words){
                System.out.println(part);
            }
        }
    }
}
