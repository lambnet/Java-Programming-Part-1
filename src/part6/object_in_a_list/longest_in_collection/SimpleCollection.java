package part6.object_in_a_list.longest_in_collection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> lists;

    public SimpleCollection(String name){
        this.name = name;
        this.lists = new ArrayList<>();
    }

    public void add(String item){
        this.lists.add(item);
    }

    public ArrayList<String> getElements(){
        return this.lists;
    }

    public String longest(){
        if(this.lists.size() < 1){
            return null;
        }
        String longest = this.lists.get(0);
        for(var list : this.lists){
            if(longest.length() < list.length()){
                longest = list;
            }
        }
        return longest;
    }
}
