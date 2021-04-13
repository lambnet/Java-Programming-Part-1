package part4.object_in_a_list.personal_information;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> lists = new ArrayList<>();
        while(true){
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String id = scanner.nextLine();

            lists.add(new PersonalInformation(firstName,lastName,id));
        }
        for(PersonalInformation list : lists){
            System.out.println(list.getFirstName() + " " + list.getLastName());
        }
    }
}
