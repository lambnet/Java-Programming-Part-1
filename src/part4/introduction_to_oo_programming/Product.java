package part4.introduction_to_oo_programming;

public class Product {
    String name;
    int quantity;
    double price;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.quantity = initialQuantity;
        this.price = initialPrice;
    }

    public void printProduct(){
        System.out.println(this.name + ", " + "price " + this.price + ", " + this.quantity + " pcs");
    }

}
