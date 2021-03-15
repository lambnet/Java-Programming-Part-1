package part3.arrays;

public class PrintNeatly {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length-1){
                System.out.print(", ");
            }
        }
    }
}
