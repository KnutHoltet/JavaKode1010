import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class EspressoMaskin {
    public int vannTank;

    public ArrayList<Espresso> espresso;
    public ArrayList<Espresso> lungo;
    public HashMap<String, ArrayList<Espresso>> allKaffe;

    public EspressoMaskin(int vannTank){
        this.vannTank = vannTank;
        espresso = new ArrayList<>();
        lungo = new ArrayList<>();
        allKaffe = new HashMap<>();
        allKaffe.put("Espresso", espresso);
        allKaffe.put("Lungo", lungo);
    }

    // Lag espresso dersom det er nok vann
    public void lagEspresso(){
        if (this.vannTank >= 40){
            Espresso esp = new Espresso("Espresso");
            this.vannTank -= 40;
            espresso.add(esp);
        }else{
            System.out.println("Ikke nok vann : " + this.vannTank);
        }
    }

    public void lagLungo(){
        if (this.vannTank >= 110){
            Espresso lng = new Espresso("Lungo");
            this.vannTank -= 110;
            lungo.add(lng);
        }else{
            System.out.println("Ikke nok vann : " + this.vannTank);
        }
    }

    // Fyll på et gitt antall milliliter vann, dersom det er plass
    public void fyllVann(int ml){
        if (this.vannTank <= 1000){
            this.vannTank += ml;
        }else{
            System.out.println("For mye vann, du kan maks fylle : " + (1000 - this.vannTank));
        }
    }

    // Les av målestrekene på vanntanken og tilgjengelig vann i ml
    public int hentVannmengde(){
        return this.vannTank;
    }

    public HashMap<String, ArrayList<Espresso>> getMap(){
        return allKaffe;
    }

    public void skrivUtKaffe(){
        for(Map.Entry<String, ArrayList<Espresso>> kaffe : allKaffe.entrySet()){
            System.out.println(kaffe.getKey() + ":");
            skrivUtliste(kaffe.getValue());
        }
    }

    public void skrivUtliste(ArrayList<Espresso> liste){
        for(Espresso kaffe : liste){
            System.out.println(kaffe.hentNavn());
        }
    }

}
