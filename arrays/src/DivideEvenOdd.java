import java.util.Arrays;

// Separate ODD and EVEN numbers in the same array without using another array.
public class DivideEvenOdd {
    public static void main(String[] args){
        int[] arr = {8, 1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = arr.length - 1;
        int i = -1;
        for(int j = 0; j < end; j++){
            if(arr[j]%2 != 0){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for(int j = 0; j < end; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
