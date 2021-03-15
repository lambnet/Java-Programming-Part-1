package part3.using_strings;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=0;
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                System.out.println("Age of the oldest: " + age);
                break;
            }else{
                String[] part = str.split(",");
                    int personAge = Integer.valueOf(part[part.length-1]);
                    if(personAge >= age){
                        age = personAge;
                }
            }
        }
    }
}
