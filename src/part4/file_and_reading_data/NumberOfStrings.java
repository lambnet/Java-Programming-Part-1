package part4.file_and_reading_data;


import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while(true){
            String word = scanner.nextLine();
            if(word.equals("end")){
                System.out.println(words.size());
                break;
            }
            words.add(word);
        }
    }
}
