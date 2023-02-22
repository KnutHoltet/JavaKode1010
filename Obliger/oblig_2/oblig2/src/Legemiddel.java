abstract class Legemiddel{
    public static int teller = 0;
    public final String navn;
    public int pris;
    public final double virkestoff;
    public final int id;
    public Legemiddel(String navn, int pris, double virkestoff){
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
        id = teller;
        teller++;
    }

    public int hentPris(){
        return this.pris;
    }

    public void settPris(int pris){
        this.pris = pris;
    }

    public int hentId(){
        return this.id;
    }

    public String toString(){
        return String.format(
                "Navn: %s, ID: %s, Pris: %s, Virkestoff: %s", this.navn, this.id, this.pris, this.virkestoff
        );
    }
}