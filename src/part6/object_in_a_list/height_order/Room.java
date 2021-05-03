package part6.object_in_a_list.height_order;

import java.util.ArrayList;

public class Room {
    ArrayList<Person> personLists;

    public Room(){
        this.personLists = new ArrayList<>();
    }

    public void add(Person person){
        this.personLists.add(person);
    }

    public boolean isEmpty(){
        return this.personLists.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return personLists;
    }

    public Person shortest(){
        if(this.personLists.isEmpty()){
            return null;
        }
        Person shortest = this.personLists.get(0);
        for(Person person : personLists){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take(){
        if(this.personLists.isEmpty()){
            return null;
        }
        Person shortest = this.personLists.get(0);
        for(Person person : personLists){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        personLists.remove(shortest);
        return shortest;
    }


}
