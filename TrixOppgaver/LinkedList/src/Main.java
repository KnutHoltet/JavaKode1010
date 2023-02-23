import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        Den kalles linked list fordi hvert objekt kjenner til forrige og neste element
         */
        LinkedList<Integer> linky = new LinkedList();

        linky.add(59);
        linky.add(22);
        linky.add(84);

        /*
        Hvordan hente elementer ut fra indeks
         */

        System.out.println(
                linky.get(1)
        );

        Iterator it = linky.iterator();
        /*
        For aa bruke en Iterator, kaster man den som regel inn i en while loop
        Kjoer kode for aa finne det spesefikke elementet
         */
        while (it.hasNext()){
            if((int) it.next() == 22){
                System.out.println("We found 22");
            }
        }
    }
}