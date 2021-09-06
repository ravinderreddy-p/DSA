public class LCSMemoization {
    public static void main(String[] args) {
        String s1 = "AXYZ";
        String s2 = "BAZ";
        int m = s1.length();
        int n = s2.length();
        int results = lcs(s1, s2, m, n);
        System.out.println(results);
    }
    private static int[][] memo = new int[5][4];
    private static int lcs(String s1, String s2, int m, int n) {
        if(memo[m][n] != -1 )
            return memo[m][n];
        return -1;
    }
}
