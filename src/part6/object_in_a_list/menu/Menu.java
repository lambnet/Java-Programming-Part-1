package part6.object_in_a_list.menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!this.meals.contains(meal)){
            this.meals.add(meal);
        }

    }

    public void printMeals(){
        for(var meal : meals){
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        if(this.meals.size() > 0){
            this.meals.clear();
        }
    }
}
