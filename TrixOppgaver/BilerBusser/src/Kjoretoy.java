abstract class Kjoretoy {
    String regNr;
    String merke;
    String eier;
    public Kjoretoy(String regNr, String merke, String eier){
        this.regNr = regNr;
        this.merke = merke;
        this.eier = eier;
    }

    public String toString(){
        return String.format("RegNr: %s, Merke: %s, Eier: %s", this.regNr, this.merke, this.eier);
    }
}
