public class NumMalesFemales {
    public static void main(String[] args){
        int numMales = 7;
        int numFemales = 3;
        int k = 3;
        char[] order = order(numMales, numFemales, k);
        System.out.println(order);
    }

    private static char[] order(int numMales, int numFemales, int k) {

        int n = numMales + numFemales;
        char[] order = new char[n];
        for(int i = 0; i < n; i++){
            if((i+1)%k == 0 && numFemales != 0){
                order[i] = 'F';
                numFemales--;
            }
            else{
                order[i] = 'M';
            }
        }

        return order;
    }
}
