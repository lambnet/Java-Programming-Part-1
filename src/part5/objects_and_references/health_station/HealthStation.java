package part5.objects_and_references.health_station;

public class HealthStation {
    private int weighings;

    public HealthStation(){
        this.weighings = 0;
    }

    public int weigh(Person person){
        this.weighings += 1;
        return person.getWeight();
    }

    public void feed(Person person){
        int personWeigh = person.getWeight();
        person.setWeight(personWeigh + 1);
    }

    public int weighings(){
        return weighings;
    }
}
