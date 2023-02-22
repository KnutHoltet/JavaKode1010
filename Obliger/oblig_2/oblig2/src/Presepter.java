class Presepter extends HviteResepter {
    static int rabatt = 108;
    public Presepter(Legemiddel legemiddel, Lege utskrivendeLege, int reit){
        super(legemiddel, utskrivendeLege, reit);
        if ((legemiddel.hentPris() - rabatt) <= 0){
            legemiddel.settPris(1);
        }else{
            int nyPris = legemiddel.hentPris() - rabatt;
            legemiddel.settPris(nyPris);
        }
    }
}
