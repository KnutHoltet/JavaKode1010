public class KoLapp {
    private static int antallLapper = 1;
    private int nr;
    public KoLapp(){
        this.nr = antallLapper;
        antallLapper++;
    }

    public int hentNr(){
        return this.nr;
    }
}
