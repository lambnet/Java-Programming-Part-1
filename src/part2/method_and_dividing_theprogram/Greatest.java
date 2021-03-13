package part2.method_and_dividing_theprogram;

public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(2,7,7);
        System.out.println("Greatest: "+ answer);
    }
    public static int greatest(int number1, int number2, int number3){
        int res = number1;
        if(number2 >= res){
            res = number2;
        }
        if(number3 >= res){
            res = number3;
        }
        return res;
    }
}
