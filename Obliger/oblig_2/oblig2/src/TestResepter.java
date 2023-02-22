class TestResepter {
    public static void sjekk(String hva, boolean test){
        if(!test){
            System.out.println("Sjekken '" + hva + "' feilet!");
            System.exit(1);
        }
    }

    public static void testMilResept(){
        String navn = "Morfin";
        int pris = 100;
        double virkestoff = 10;
        int styrke = 10;

        Narkotisk narkotisk = new Narkotisk(navn, pris, virkestoff, styrke);
        Lege lege = new Lege();
        MilResept milResept = new MilResept(narkotisk, lege);
        //pasientid og reit
        sjekk("test.MilResept.hentPris()", milResept.prisAaBetale() == 0);
        sjekk("test.MilResept.hentReit()", milResept.hentReit() == 3);

        System.out.println("testMilResept(): Alt riktig!");
    }

    public static void main(String[] args) {
        System.out.println("** Test Resept subklasser **");
        testMilResept();
    }
}

