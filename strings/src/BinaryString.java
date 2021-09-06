public class BinaryString {
    public static void main(String[] args){
        String str = "1111";
        int subStringCount = countSubStrings(str);
        System.out.println(subStringCount);
        int subStringCountBestWay = countSubStringsBestWay(str);
        System.out.println(subStringCountBestWay);
    }

    private static int countSubStringsBestWay(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1')
                count++;
        }
        return (count*(count-1))/2;
    }

    private static int countSubStrings(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == '1'){
                for(int j = i+1; j < str.length(); j++){
                    if(str.charAt(j) == '1')
                        count++;
                }
            }
        }
        return count;
    }
}
