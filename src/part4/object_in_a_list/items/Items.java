package part4.object_in_a_list.items;
import part4.object_in_a_list.items.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> lists = new ArrayList<>();
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            lists.add(new Item(name));
        }
        for(Item list : lists){
            System.out.println(list);
        }
    }
}
