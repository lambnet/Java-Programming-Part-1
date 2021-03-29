package part4.introduction_to_oo_programming;

public class Agent {
    private String firstName;
    private String lastName;

    public Agent(String initFirstName, String initLastName){
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }

    public String toString(){
        return "My name is " + this.firstName + ", " + this.firstName + " " + this.lastName;
    }
}
