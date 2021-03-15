package part3.arrays;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printStars(int n){
        for(int i=1; i<=n; i++){
            System.out.print("*");

        }
    }
    public static void printArrayInStars(int[] arr){
        for(int i=0; i<arr.length; i++){
            printStars(arr[i]);
            System.out.println();
        }
    }
}
