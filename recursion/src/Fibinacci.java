public class Fibinacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(getFibinacci(n));
    }

    private static int getFibinacci(int n) {
        if(n == 0 || n == 1)
            return n;
        return getFibinacci(n-1) + getFibinacci(n - 2);
    }
}
