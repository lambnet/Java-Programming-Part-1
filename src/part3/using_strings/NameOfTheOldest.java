package part3.using_strings;

import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                System.out.println("Name of the oldest: " + name);
                break;
            } else {
                String[] part = str.split(",");
                int personAge = Integer.valueOf(part[part.length - 1]);
                String personName = part[0];
                if (personAge >= age) {
                    age = personAge;
                    name = personName;
                }

            }
        }
    }
}
