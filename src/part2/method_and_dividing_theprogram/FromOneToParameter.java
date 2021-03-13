package part2.method_and_dividing_theprogram;

public class FromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(2);
    }
    public static void printUntilNumber(int num){
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}
