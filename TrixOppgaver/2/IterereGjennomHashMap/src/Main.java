import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Student studentEn = new Student("Knut", 20);
        Student studentTo = new Student("Marius", 20);

        HashMap studenter = new HashMap<>();
        studenter.put(studentEn, true);
        studenter.put(studentTo, true);


        // printer ut, noekkel og verdi uten aa bruke toString metoden
        studenter.forEach((key, value) -> System.out.println(key));

        for (String nokkel : studenter.keySet()){
            System.out.println(nokkel);
        }

        for (Student denneStudenten : studenter.values()){
            System.out.println(denneStudenten.toString());
        }
    }
}