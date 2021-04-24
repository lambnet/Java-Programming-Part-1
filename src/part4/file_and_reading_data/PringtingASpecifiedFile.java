package part4.file_and_reading_data;

import java.util.Scanner;
import java.nio.file.Paths;

public class PringtingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                System.out.println(row);
            }
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
