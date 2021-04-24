package part5.learning_object_oriented_programming.fitbyte;

public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double maximumHeartRate(int age){
        return 206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentageOfMaximum){
        return ((maximumHeartRate(this.age) - this.restingHeartRate) * percentageOfMaximum) + this.restingHeartRate;
    }


}
