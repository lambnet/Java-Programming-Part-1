package part4.file_and_reading_data;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        // read the file
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
                names.add(fileReader.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        // check if the input name is in the file
        System.out.println("Enter names, an empty line quits.");
        while(true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            if(names.contains(name)){
                System.out.println("The name is on the list");
            }else{
                System.out.println("The name is not on the list");
            }
        }
        System.out.println("Thank you");

    }

}
