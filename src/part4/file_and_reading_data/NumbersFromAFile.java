package part4.file_and_reading_data;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lower = Integer.parseInt(scanner.nextLine());
        System.out.print("Upeer bound? ");
        int upper = Integer.parseInt(scanner.nextLine());
        try(Scanner fileReader = new Scanner(Paths.get("src/part4/file_and_reading_data/"+fileName))){
            while(fileReader.hasNextLine()){
                int num = Integer.parseInt(fileReader.nextLine());
                if(num >= lower && num <= upper){
                    numbers.add(num);
                }
            }
        }catch(Exception e){
            System.out.println();
        }
        System.out.println("Numbers:" + numbers.size());

    }

}
