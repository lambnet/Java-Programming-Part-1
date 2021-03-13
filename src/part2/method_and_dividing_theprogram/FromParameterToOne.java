package part2.method_and_dividing_theprogram;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(0);
    }
    public static void printFromNumberToOne(int num){
        while(num != 0){
            System.out.println(num);
            num--;
        }
    }
}
