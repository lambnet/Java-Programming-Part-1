package part5.overloading_method_and_constructors.constructor_overload;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight){
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name){
        this(name, "shelf", 1);
    }

    public Product(String name, String location){
        this(name, location, 1);
    }

    public Product(String name, int weight){
        this(name, "shelf", weight);
    }

    public String toString(){
        return this.name + " (" + this.weight + ") " + "can be found from the " + this.location;
    }
}
