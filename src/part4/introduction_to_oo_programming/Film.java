package part4.introduction_to_oo_programming;

public class Film {
    public String name;
    public int ageRating;

    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public String name(){
        return this.name;
    }

    public int ageRating(){
        return this.ageRating;
    }
}
