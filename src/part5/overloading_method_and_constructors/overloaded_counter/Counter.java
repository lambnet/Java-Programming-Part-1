package part5.overloading_method_and_constructors.overloaded_counter;

public class Counter {
    private int number;

    public Counter(int number){
        this.number = number;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return this.number;
    }

    public void increase(int increaseBy){
        this.number += increaseBy;
    }

    public void increase(){
        this.increase(1);
    }

    public void decrease(int decreaseBy){
        this.number -= decreaseBy;
    }

    public void decrease(){
        this.decrease(1);
    }

}
