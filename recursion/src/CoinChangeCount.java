public class CoinChangeCount {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6};
        int sum = 10;
        int n = arr.length;
        int count = getCoinCount(arr, n, sum);
        System.out.println(count);
    }

    private static int getCoinCount(int[] arr, int n, int sum) {
        if(sum == 0)
            return 1;
        if(n == 0)
            return 0;
        int result = getCoinCount(arr, n-1, sum);
        if(arr[n-1] <= sum){
            result = result + getCoinCount(arr, n, sum - arr[n-1]);
        }
        return result;

    }
}
