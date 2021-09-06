import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        int numMales = 5;
        int numFemales = 3;
        char[] str = new char[numMales+numFemales];
        for(int i = 0 ; i  < str.length; i++){
            str[i] = 'M';
        }
        System.out.println(str);
        int K = 2;
        int i = 0;
        while(numFemales > 0){
            if(numFemales%(i+1) == 0){
                str[i] = 'F';
                numFemales--;
                i++;
            }
        }
        System.out.println(str);
    }
}
