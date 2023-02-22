class MilResept extends HviteResepter {
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
}
