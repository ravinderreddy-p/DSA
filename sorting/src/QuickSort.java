public class QuickSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 6, 1, 2, 7, 10};
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr, start, end);
        for(int i = 0; i <= end; i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] quickSort(int[] arr, int start, int end) {
        if(start < end){
            int pivotIdx = partition(arr, start, end);
            quickSort(arr, start, pivotIdx-1);
            quickSort(arr, pivotIdx+1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivotElement = arr[end];
        int i = start;
        int endIdx = end - 1;
        while(i <= endIdx){
            if(arr[i] > pivotElement){
//                swap two elements
                int temp = arr[i];
                arr[i] = arr[endIdx];
                arr[endIdx] = temp;
                endIdx--;
            }
            else {
                i++;
            }
        }
//        Swap arr[i] & pivotElement
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
