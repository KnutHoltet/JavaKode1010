class BlaaResepter extends Resept {
    static double rabatt = 0.75;
    public BlaaResepter(Legemiddel legemiddel, Lege utskrivendeLege, int reit){
        super(legemiddel, utskrivendeLege, reit);
        double gammelPris = Math.round(legemiddel.hentPris() * rabatt);
        int nyPris = (int) gammelPris;
        legemiddel.settPris(nyPris);
    }

    public String farge(){
        return "Dette er en blaa resept";
    }

    public int prisAaBetale(){
        return legemiddel.hentPris();
    }
}
