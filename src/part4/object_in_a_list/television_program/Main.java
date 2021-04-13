package part4.object_in_a_list.television_program;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.print("Program's maximum duration? ");
        int max = Integer.parseInt(scanner.nextLine());
        for(TelevisionProgram program : programs){
            if(program.getDuration() <= max){
                System.out.println(program);
            }
        }
    }
}
