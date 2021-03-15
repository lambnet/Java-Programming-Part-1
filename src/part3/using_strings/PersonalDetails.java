package part3.using_strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        while(true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] records = str.split(",");
            names.add(records[0]);
            ages.add(Integer.valueOf(records[1]));
        }
            // find the longest name
            String longestName = names.get(0);
            for(String name : names){
                if(name.length()>longestName.length()){
                        longestName = name;
                }
            }
            // find the average of birth year
            int sum = 0;
            for(int year : ages){
                sum += year;
            }
            double avg = (double) sum/ ages.size();
            System.out.println("Longest name: " + longestName);
            System.out.println("Averageof the birth years: " + avg);

    }

}


