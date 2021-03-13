package part3.list;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 0; i<10; i++){
            myList.add(i);
        }
        System.out.println(myList.get(10));
    }
}
