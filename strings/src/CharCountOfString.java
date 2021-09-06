import java.util.HashMap;
import java.util.Map;

public class CharCountOfString {
    public static void main(String[] args){
        String str = "nalitapalai";
        HashMap<Character, Integer> hm = new HashMap<>();
        int k = 4;
        for(int i = 0; i < str.length(); i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            }
            else{
                hm.put(str.charAt(i), 1);
            }
        }
        boolean isfound = false;
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            if(entry.getValue() == k){
                System.out.println(entry.getKey());
                isfound = true;
            }
        }
        if(!isfound){
            System.out.println(-1);
        }
    }
}
