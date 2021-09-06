import java.util.HashMap;
import java.util.Map;

//Given an array A[] of N positive integers which can contain integers
// from 1 to P where elements can be repeated or can be absent from the array.
// Your task is to count the frequency of all elements from 1 to N
public class CountFrequency {
    public static void main(String[] args){
        int[] arr = {2, 3, 2, 3, 5};
        int p = 5;
        int[] counter = new int[p+1];
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            if(counter[key] == 0){
                counter[key] = 1;
            }
            else {
                counter[key] = counter[key] + 1;
            }
        }
        for(int i=1; i <= p; i++){
            System.out.print(i +" " + counter[i] +" ");
            System.out.println();
        }

        HashMap<Integer, Integer> hm = new HashMap<>(p);
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            if(hm.containsKey(key)){
                hm.put(key, hm.get(key)+1);
            }
            else {
                hm.put(key, 1);
            }
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            System.out.println(e.getValue());
        }
        for(int i = 1; i <= p; i++){
            if(hm.containsKey(i)){
                System.out.println(i + ": " + hm.get(i));
            }
            else {
                System.out.println(i + ": " + 0);
            }
        }
    }
}
