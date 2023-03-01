class Personbil extends Kjoretoy{
    int antSittePl;
    public Personbil(String regNr, String merke, String eier, int antSittePl){
        super(regNr, merke, eier);
        this.antSittePl = antSittePl;
    }

    public int aarsAvgift(){
        return 3000;
    }
}
