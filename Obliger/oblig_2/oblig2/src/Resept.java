abstract class Resept{
    static int teller = 0;
    int id;
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    int pasientId;
    int reit;
    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int reit){
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        id = teller;
        teller++;
    }

    public int hentId(){
        return this.pasientId;
    }

    public Legemiddel hentLegemiddel(){
        return this.legemiddel;
    }

    public Lege hentLege(){
        return this.utskrivendeLege;
    }

    public int hentPasientId(){
        return this.pasientId;
    }

    public int hentReit(){
        return this.reit;
    }

    public boolean bruk(){
        if (reit > 0) {
            reit--;
            return true;
        }else{
            return false;
        }
    }

    abstract public String farge();
    abstract public int prisAaBetale();
}