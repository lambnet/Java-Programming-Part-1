package part5.objects_and_references.comparing_apartments;

import static java.lang.Math.abs;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare){
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares >= compared.squares){
            return true;
        }return false;
    }

    public int priceDifference(Apartment compared){
        return abs(this.price() - compared.price());
    }

    public int price(){
        return pricePerSquare * squares;
    }

    public boolean moreExpensiveThan(Apartment compared){
        if(this.price() > compared.price()){
            return true;
        }return false;
    }
}
