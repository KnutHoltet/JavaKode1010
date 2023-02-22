class HviteResepter extends Resept {

    public HviteResepter(Legemiddel legemiddel, Lege utskrivendeLege, int reit){
        super(legemiddel, utskrivendeLege, reit);
    }
    public String farge(){
        return "Hvit";
    }
    public int prisAaBetale(){
        int pris = legemiddel.hentPris();
        return pris;
    }
}

