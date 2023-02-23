class Presept extends HvitResept {
    static int rabatt = 108;
    public Presept(Legemiddel legemiddel, Lege utskrivendeLege, int reit){
        super(legemiddel, utskrivendeLege, reit);
        if ((legemiddel.hentPris() - rabatt) <= 0){
            legemiddel.settPris(1);
        }else{
            int nyPris = legemiddel.hentPris() - rabatt;
            legemiddel.settPris(nyPris);
        }
    }

    @Override
    public int prisAaBetale(){
        return legemiddel.hentPris();
    }

    @Override
    public String toString(){
        return String.format("Legemiddel: %s, Pris: %s, Reit: %s", legemiddel.toString(), this.prisAaBetale(), this.reit);
    }
}
