// Solving this Fibinacci problem using Top-Down DP approach (Memoization).
public class Fibinacci {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(fibinacci(n));
    }
   public static int[] memoization = {-1, -1, -1, -1, -1, -1};
    private static int fibinacci(int n) {
        if(memoization[n] == -1){
            int res;
            if(n == 0 || n == 1)
                res = n;
            else res = fibinacci(n-1) + fibinacci(n-2);
            memoization[n] = res;
        }
        return memoization[n];
    }
}
