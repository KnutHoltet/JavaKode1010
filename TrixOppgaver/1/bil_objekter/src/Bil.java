public class Bil{
    private String eier;
    private String merke;
    public Bil(String eier, String merke){
        this.eier = eier;
        this.merke = merke;
    }
    public void skrivUt(){
        String eier = this.eier;
        String merke = this.merke;

        System.out.println("Eier: "  + eier + "     Merke: " + merke);
    }


}

