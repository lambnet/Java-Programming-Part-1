package part4.introduction_to_oo_programming;

public class Whistle {
    private String sound;
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }

    public void sound(){
        System.out.println(this.sound);
    }
}
