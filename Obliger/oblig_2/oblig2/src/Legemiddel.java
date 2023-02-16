abstract class Legemiddel{
    public static int teller = 0;
    public final int id;
    public final String navn;
    public int pris;
    public double virkestoff;
    public Legemiddel(String navn, int pris, double virkestoff){
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
        this.id = teller;
        teller++;
    }

    public int hentPris(){
        return this.pris;
    }

    public void settPris(int pris){
        this.pris = pris;
    }
}