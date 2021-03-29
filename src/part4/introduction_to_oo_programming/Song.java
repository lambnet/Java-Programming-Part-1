package part4.introduction_to_oo_programming;

public class Song {
    public String name;
    public int length;
    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String name(){
        return this.name;
    }

    public int length(){
        return this.length;
    }
}
