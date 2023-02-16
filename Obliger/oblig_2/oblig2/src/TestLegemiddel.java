class TestLegemiddel {
    private static void sjekk(String hva, boolean test){
        if (!test){
            System.out.println("Sjekken '" + hva + "' feilet!");
            System.exit(1);
        }
    }
    //TODO skriv testmetode for nark
    private static void testNarkotisk(){
        String navn = "Heroin";
        int pris = 100;
        double virkestoff = 10;
        int styrke = 10;

        Narkotisk narkotisk = new Narkotisk(navn, pris, virkestoff, styrke);
        sjekk("testNarkotisk.hentPris()", narkotisk.hentPris() == 100);
        narkotisk.settPris(150);
        sjekk("testNarkotisk.settPris()", narkotisk.hentPris() == 151);
        System.out.println("testNarkotisk(): Alt riktig!");
    }
    //TODO skriv testmetode for vane
    //TODO skriv testmetode for vanlig
    public static void main(String[] args) {
        System.out.println("** Test Legemiddel subklasser **");
        testNarkotisk();
        // testVanedannende();
        // test.Vanlig();
    }
}
