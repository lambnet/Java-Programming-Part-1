package part4.file_and_reading_data.storing_records;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        ArrayList<Person> records = readRecordsFromFile(fileName);
        System.out.println("Person:" + records.size());
        System.out.println("Person:");
        for (Person person : records){
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file){
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner fileReader = new Scanner(Paths.get("src/part4/file_and_reading_data/"+file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                persons.add(new Person(name, age));
            }
        }catch(Exception e){
            System.out.println("Reading the file failed ");
        }

        return persons;
    }
}
