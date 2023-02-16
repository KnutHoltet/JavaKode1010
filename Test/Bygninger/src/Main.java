import java.util.HashMap;
class Bygning{
    public Bygning(){
        System.out.println("Dette er bygning klassen");
    }
}

class Skyskraper extends Bygning{
    public Skyskraper(){
        System.out.println("Dette er skyskraper klassen");
    }
}

public class Main {
    public static void main(String[] args) {
        /*
        Det som skjer er at vi oppretter et objekt av subklassen skyskraper
        som er en utvidelse av superklassen bygning
         */
        Skyskraper skyskraper = new Skyskraper();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Knut", 20);
        map.put("Marius", 20);
        map.put("Viljar", 30);
        map.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}




