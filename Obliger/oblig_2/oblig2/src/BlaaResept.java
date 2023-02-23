class BlaaResept extends Resept {
    static double rabatt = 0.75;
    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int reit){
        super(legemiddel, utskrivendeLege, reit);
        double gammelPris = Math.round(legemiddel.hentPris() * rabatt);
        int nyPris = (int) gammelPris;
        legemiddel.settPris(nyPris);
    }

    public String farge(){
        return "Blaa";
    }

    public int prisAaBetale(){
        return legemiddel.hentPris();
    }

    public String toString(){
        return String.format("Resept-farge: %s", this.farge());
    }
}