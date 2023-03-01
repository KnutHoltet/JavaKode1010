public class Main {
    private static <T> void sjekk(String hva, boolean test, T result){
        if(!test){
            System.out.println("Testen '" + hva + "' feilet!");
            System.out.println(result);
            System.exit(1);
        }
    }

    public static void testAreal(){
        Boks box = new Boks(4, 4,4);
        sjekk("testAreal", box.beregnAreal() == 96, box.beregnAreal());
        System.out.println("Test Areal er riktig");
    }

    public static void testErSant(){
        Boks box = new Boks(4, 4,4);
        sjekk("erSant()", !box.erSant(), box.erSant());
    }

    public static void main(String[] args) {
        //testAreal();
        testErSant();
    }
}