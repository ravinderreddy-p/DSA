public class RightShiftZeros {
    public static void main(String[] args) {
        int[] arr = {9, 1, 0, 0, 2, 7, 6, 0};
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[counter] = arr[i];
                counter++;
            }
        }
        System.out.println(counter);
        int zeroCount = arr.length - counter;
        System.out.println(zeroCount);
        while(zeroCount != 0){
            arr[counter] = 0;
            counter++;
            zeroCount--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
