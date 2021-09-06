public class FibonacciPractice {
    public static void main(String[] args) {
        int n = 3;
        int results = getFibonacci(n);
        System.out.println(results);
        int tabResults = getFibonacciTab(n);
        System.out.println(tabResults);
    }

    private static int getFibonacciTab(int n) {
        if(n == 0)
            return 0;
        if (n == 1)
            return 1;
        if(n == 2)
            return 1;
        int[] table = new int[n+1];
        table[1] = 1;
        table[2] = 1;
        for(int i = 3; i <= n; i++){
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }

    private static int getFibonacci(int n) {
        int[] memo = new int[n+1];
        for(int i = 1; i <= n; i++)
            memo[i] = -1;
        if(memo[n] == -1){
            if(n == 1 || n == 2)
                memo[n] = 1;
            else{
                memo[n] = getFibonacci(n-1) + getFibonacci(n-2);
            }
        }
        return memo[n];

    }
}
