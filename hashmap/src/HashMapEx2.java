import java.util.HashMap;

//        Given an array A[] of N positive integers which can contain integers from 1 to P
//        where elements can be repeated or can be absent from the array.
//        Your task is to count the frequency of all elements from 1 to N.
//        Input:
//        N = 5
//        arr[] = {2, 3, 2, 3, 5}
//        P = 5
//        Output:
//        0 2 2 0 1
public class HashMapEx2 {
    public static void main(String[] args){
        int arr[] = {2, 3, 2, 3, 5};
        int P = 5;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);  // 2 2  3 2 5 1
            }
        }
        for(int i = 1; i <= P; i++){
            if(hm.containsKey(i)){
                System.out.print(hm.get(5) + " ");
            }
            else {
                System.out.print("0 ");
            }
        }

    }
}

