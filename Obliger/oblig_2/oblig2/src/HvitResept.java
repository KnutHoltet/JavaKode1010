class HvitResept extends Resept {

    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int reit){
        super(legemiddel, utskrivendeLege, reit);
    }
    public String farge(){
        return "Hvit";
    }
    public int prisAaBetale(){
        int pris = legemiddel.hentPris();
        return pris;
    }

    public String toString(){
        return String.format("Resept-farge: %s", this.farge());
    }
}