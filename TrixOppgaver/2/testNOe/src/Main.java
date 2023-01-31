import java.util.HashMap;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        System.out.println(map);
        ArrayList<Integer> liste = new ArrayList<>();
        map.put("Key1", liste);

        ArrayList<Integer> values = map.get("Key1");
        values.add(1);
        map.put("Key1", values);

        System.out.println(map);



    }
}