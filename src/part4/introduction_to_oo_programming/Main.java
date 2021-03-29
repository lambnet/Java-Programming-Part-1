package part4.introduction_to_oo_programming;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Whistle
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
        */

        /* Door
        Door alexander = new Door();
        alexander.knock();
        alexander.knock();
        */

        /* Product
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
        */

        /* Decreasing counter
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();
        counter.reset();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        */

        /* Debt
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;
        while(years < 20){
            mortgage.waitOneYear();
            years += 1;
        }
        mortgage.printBalance();
        */

        /* Song
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
        */

       /* Film
       Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
        */

        /* Gauge
        Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
        */

        /*  Agent
        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic); */

        /* Multiply
        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
        */

        /* Statistics
        Scanner scanner = new Scanner(System.in);
        Statistics sum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        System.out.println("Enter a numbers:");
        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == -1){
                System.out.println("Sum: " + sum.sum());
                System.out.println("Sum of even numbers: " + evenSum.sum());
                System.out.println("Sum of odd numbers: " + oddSum.sum());
                break;
            }
            sum.addNumber(number);
            if(number % 2 == 0){
                evenSum.addNumber(number);
            }else{
                oddSum.addNumber(number);
            }
        }
        */

       /*  Payment Card
        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);
        paul.eatHeartily();
        matt.eatAffordably();
        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());
        paul.addMoney(20);
        matt.eatHeartily();
        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());
        paul.eatAffordably();
        paul.eatAffordably();
        matt.addMoney(50);
        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());*/

    }
}
