class Spesialist extends Lege implements Godkjenningsfritak{
    public Spesialist(String navn){
        super(navn);
    }

    public String hentKontrollKode(){
        return "hei";
    }
}