class Vanlig extends Legemiddel{
    int styrke;
    public Vanlig(String navn, int pris, double virkestoff, int styrke){
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }
}