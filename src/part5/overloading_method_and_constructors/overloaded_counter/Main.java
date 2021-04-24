package part5.overloading_method_and_constructors.overloaded_counter;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        counter1.increase();
        counter2.decrease();

        System.out.println(counter1.value());
        System.out.println(counter2.value());

        counter1.increase(9);
        counter2.decrease(9);
        System.out.println(counter1.value());
        System.out.println(counter2.value());


    }
}
