public class SumOfTwoNosWithK {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        int start = 0;
        int end = arr.length - 1;
        boolean isFound = false;
        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum == k){
                System.out.println("index1: " + start + " " +arr[start]) ;
                System.out.println("index2: " + end + " " +arr[end]);
                isFound = true;
                break;
            }
            else if(sum > k){
                end --;
            }
            else{
                start++;
            }
        }
        if(isFound == false){
            System.out.println("No values found");
        }
    }
}
