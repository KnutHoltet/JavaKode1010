import com.sun.jdi.ObjectReference;

class TestOrdbeholder {
    private static void sjekk(String hva, boolean test){
        if(!test){
            System.out.println("Testen feilet!");
            System.exit(1);
        }
    }

    public static void testSettInn(){
        String noe = "hei";
        Ordbeholder ord = new Ordbeholder();
        sjekk("testSettInn", ord.settInn(noe));
        System.out.println("Sett inn metoden fungerer");
    }

    public static void testAntallOrd(){
        Ordbeholder ord = new Ordbeholder();
        ord.settInn("hei");
        sjekk("testAntallOrd", ord.antallOrd() == 1);
        System.out.println("Antall ord metoden fungerer");
    }

    public static void testPop(){
        Ordbeholder ord = new Ordbeholder();
        ord.settInn("Hello");
        ord.pop();
        sjekk("testPop", ord.pop() == null);
        System.out.println("Pop metoden fungerer");
    }

    public static void main(String[] args) {
        testSettInn();
        testAntallOrd();
        testPop();
    }
}
