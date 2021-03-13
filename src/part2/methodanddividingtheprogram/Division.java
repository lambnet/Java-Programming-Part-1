package part2.methodanddividingtheprogram;

public class Division {
    public static void main(String[] args) {
        division(15,3);
    }
    public static void division(int numerator, int denominator){
        double res = (double)numerator/denominator;
        System.out.println(res);
    }
}
