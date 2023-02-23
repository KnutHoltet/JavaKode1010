class MilResept extends HvitResept {
    public MilResept(Legemiddel legemiddel, Lege utskrivendeLege){
        super(legemiddel, utskrivendeLege, 3);
        legemiddel.settPris(0);
    }

    @Override
    public int prisAaBetale(){
        return legemiddel.hentPris();
    }

    public int hentReit(){
        return this.reit;
    }

    @Override
    public String toString(){
        return String.format("Legemiddel: %s, Pris: %s, Reit: %s", legemiddel.toString(), this.prisAaBetale(), this.reit);
    }
}
