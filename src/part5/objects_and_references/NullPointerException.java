package part5.objects_and_references;

import java.util.ArrayList;

public class NullPointerException {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=5; i++){
            numbers.add(i);
        }
        for(int number : numbers){
            System.out.println(number);
        }
        numbers = null;
        System.out.println(numbers);

    }


}
