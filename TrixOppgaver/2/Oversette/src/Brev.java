import java.util.ArrayList;
public class Brev{
    private String avsender;
    private String mottaker;
    private ArrayList<String> linjer = new ArrayList<>();

    public Brev(String avsender, String mottaker){
        this.avsender = avsender;
        this.mottaker = mottaker;
    }

    public void skrivLinje(String linje){
        linjer.add(linje);
    }

    public void lesBrev(){
        System.out.println("Hei " + mottaker);
        System.out.println();
        for (String linje : linjer){
            System.out.println(linje);
        }
        System.out.println();
        System.out.println("Hilsen fra,");
        System.out.println(avsender);
    }

    public static void main(String[] args) {
        Brev brev = new Brev("Knut", "Marius");
        brev.skrivLinje("Hei mann, hvordan har du det?");
        brev.skrivLinje("Jeg har det bra!");
        brev.lesBrev();
    }
}
