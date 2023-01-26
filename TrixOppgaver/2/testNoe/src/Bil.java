public class Bil {
    private static int antall = 0;
    private String merke;
    private int prodNr;

    public Bil(String merke){
        prodNr = antall;
        antall++;
        this.merke = merke;

    }
    public int hentProdNr(){
        return prodNr;
    }



}