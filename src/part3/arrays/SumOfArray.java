package part3.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5,1,3,4,2};
        int check = sumOfNumbersInArray(numbers);
        System.out.println(check);
    }
    public static int sumOfNumbersInArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
