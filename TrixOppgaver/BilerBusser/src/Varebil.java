public class Varebil extends Kjoretoy{
    int maksVekt;
    public Varebil(String regNr, String merke, String eier, int maksVekt){
        super(regNr, merke, eier);
        this.maksVekt = maksVekt;
    }

    public int aarsAvgift(){
        return 4 * maksVekt;
    }
}
