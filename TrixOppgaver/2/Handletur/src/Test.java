import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        int multiplier = 2;

        /*
        proevde aa finne en maate aa gjoere det i en loop men orker ikke,
        bare gjoer det manuelt for aa loese oppgaven
         */
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue() * multiplier);
        }

    }
}
