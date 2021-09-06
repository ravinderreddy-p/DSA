public class LCSPractice {
    public static void main(String[] args) {
        String str1 = "aggtab";
        String str2 = "gxtxayb";
        int m = str1.length();
        int n = str2.length();
        int count = countLCS(str1, str2, m, n);
        System.out.print(count);
    }

    private static int countLCS(String str1, String str2, int m, int n) {
        if(m == 0 || n == 0)
            return 0;
        else if(str1.charAt(m-1) == str2.charAt(n-1)){
            return countLCS(str1, str2, m-1, n-1) + 1;
        }
        else {
            return Math.max(countLCS(str1, str2, m-1, n), countLCS(str1, str2, m, n-1));
        }
    }
}

