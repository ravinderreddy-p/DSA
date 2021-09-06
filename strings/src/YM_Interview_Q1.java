//If SearchKey exist in given String then print true else false.
public class YM_Interview_Q1 {
    public static void main(String[] args){
        String str1 = "charivi";
        String searchKey = "r*v";
        boolean isExist = false;
        for(int i = 0; i <= str1.length()-3; i++){
            if(searchKey.charAt(0) == str1.charAt(i) && searchKey.charAt(2) == str1.charAt(i+2)){
                isExist = true;
                break;
            }
        }
        System.out.println(isExist);
    }
}
