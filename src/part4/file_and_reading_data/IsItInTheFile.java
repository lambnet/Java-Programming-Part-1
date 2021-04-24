package part4.file_and_reading_data;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        System.out.println("Search for:");
        String name = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
           while(fileReader.hasNextLine()){
               names.add(fileReader.nextLine());
           }
            if(names.contains(name)){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
        }catch(Exception e){
            System.out.println("Reading the file " + fileName +" failed.");

        }
    }
}
