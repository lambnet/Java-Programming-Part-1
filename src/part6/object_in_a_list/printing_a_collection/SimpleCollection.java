package part6.object_in_a_list.printing_a_collection;

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

    public String toString(){
        if(this.lists.isEmpty()){
            return "The collection " + this.name + " is empty";
        }
        String helper = "";
        for(var list : lists){
            helper += "\n" + list;
        }
        return "The collection " + this.name + " has " + this.lists.size() + " elements: " + helper;
    }

}
