import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[]args){
        HashMap<String, Integer> hm1  = new HashMap<>();

        hm1.put("Knut", 20);
        hm1.put("Per", 26);
        hm1.put("Ole", 15);
        hm1.put("Bente", 36);

        for (HashMap.Entry<String, Integer> set : hm1.entrySet()){
            System.out.println(set.getKey() + " = " + set.getValue());
        }
        Map<String, Integer> map = Map.ofEntries(
                Map.entry("apple", 1),
                Map.entry("banana", 2),
                Map.entry("cherry", 3)
        );

        map.forEach((key, value) -> System.out.println(key + " : " + value));
        hm1.forEach((key, value) -> System.out.println(key + " : " + value));
        hm1.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}