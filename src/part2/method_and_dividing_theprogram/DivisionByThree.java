package part2.method_and_dividing_theprogram;

public class DivisionByThree {
    public static void main(String[] args) {
        divisibleByThree(2,15);
    }
    public static void divisibleByThree(int beginning, int end){
        for(int i = beginning; i<=end; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
