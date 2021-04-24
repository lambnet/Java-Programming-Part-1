package part5.learning_object_oriented_programming.one_minute;

public class OneMinute {
    public static void main(String[] args) {
        Timer timer = new Timer();
        while(true){
            System.out.println(timer);
            timer.advance();

            try{
                Thread.sleep(10);
            }catch (Exception e){

            }
        }
    }
}
