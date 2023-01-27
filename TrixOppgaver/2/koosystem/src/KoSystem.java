import java.util.ArrayList;
public class KoSystem {
    private ArrayList<KoLapp> kunde = new ArrayList<>();
    public void trekkKoLapp(){
        KoLapp kolapp = new KoLapp();
        System.out.println(kolapp.hentNr());
        kunde.add(kolapp);
    }

    public void betjenKunde(){
        if (kunde.size() == 0){
            System.out.println("Det er ingen kunder aa betjene naa!");
        }else{
            kunde.remove(0);
            System.out.println("En kunde er blitt fjernet.");
        }
    }

    public int antallKunder(){
        return kunde.size();
    }

    public void printKunder(){
        for (KoLapp kund : kunde){
            System.out.println(kund);
        }
    }

}
