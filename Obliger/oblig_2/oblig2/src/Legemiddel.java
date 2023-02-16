abstract class Legemiddel{
    public final String navn;
    public int pris;
    public double virkestoff;
    public Legemiddel(String navn, int pris, double virkestoff){
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
    }
}