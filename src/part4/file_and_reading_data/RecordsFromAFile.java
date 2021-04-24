package part4.file_and_reading_data;

import java.security.spec.ECField;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        System.out.println("Name of the file? ");
        String fileName = scanner.nextLine();
        try(Scanner fileReader = new Scanner(Paths.get("src/part4/file_and_reading_data/"+fileName))){
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                if(row.isEmpty()){
                    continue;
                }else{
                    String[] parts = row.split(",");
                    String name = parts[0];
                    int age = Integer.valueOf(parts[1]);
                    data.put(name, age);
                }
            }
        }catch(Exception e){
            System.out.println("Reading the file failed");
        }
        System.out.println(data.size());
        for(String i : data.keySet()){
            System.out.println(i + "," + " age: " + data.get(i) + " years");
        }
    }
}
