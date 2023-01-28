public class Car {
    public String merke;
    public String bilNr;
    public int prodNr;
    public String[] liste = new String[3];
    public Bikes[] sykkler = new Bikes[3];
    public static int antall = 0;
    public Car(String merke, String bilNr){
        prodNr = antall;
        antall++;
        this.merke = merke;
        this.bilNr = bilNr;
    }

    public String hentNavn(){
        if(false){
            return this.merke;
        }
        return this.bilNr;
    }

    public void settInnString(String s){
       boolean sattInn = false;
       int teller = 0;
       while(teller < liste.length && !sattInn){
           liste[teller] = s;
           sattInn = true;
           teller++;
       }
        System.out.println(teller);
    }

    public void printBikes(){
        for (Bikes sykkel : sykkler){
            System.out.println(sykkel);
        }
    }

    public void printStringListe(){
        for (String x : liste){
            System.out.println(x);
        }
    }
}