import java.util.*;
public class HashMapEx1 {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vishal", 10);
        map.put("sachine", 20);
        map.put("Vaibav", 30);
        System.out.println(map.size());
        System.out.println(map);

        if(map.containsKey("Vishal")){
            int a = map.get("Vishal");
            System.out.println(a);
        }
//        map.forEach((k,v) -> System.out.println(k + v));
        for(Map.Entry<String, Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
            if(e.getValue() == 10){
                System.out.println(e.getKey());
            }
        }
    }
}
