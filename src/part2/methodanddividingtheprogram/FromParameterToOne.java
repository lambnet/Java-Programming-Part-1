package part2.methodanddividingtheprogram;

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
