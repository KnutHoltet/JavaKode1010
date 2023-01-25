public class Bil3 {
    String bilnummer;
    public Bil3(String bilnummer){
        this.bilnummer = bilnummer;
    }
    public void skriv_ut(){
        System.out.println(this.bilnummer);
    }
    public String hentNummer(){
        return this.bilnummer;
    }
}
