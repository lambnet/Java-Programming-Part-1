package part6.object_in_a_list.stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> s;

    public Stack(){
        this.s = new ArrayList<>();
    }

    public boolean isEmpty(){
       return this.s.isEmpty();
    }

    public void add(String value){
        this.s.add(value);
    }

    public ArrayList<String> values(){
        return this.s;
    }

    public String take(){
        return this.s.remove(this.s.size()-1);
    }
}
