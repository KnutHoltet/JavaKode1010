import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Gruppeoppmoete {
    private String[] navnListe = new String[14];
    private boolean[] oppmoete = new boolean[14];

    //TODO lese inn gruppefil metode og fylle arrayen
    public void lesInn(){
        //lage fil objk, scanner objk og legge til i array
        File f = new File("liste.txt");
        Scanner scan = new Scanner(f);
        int teller = 0;
        while(scan.hasNextLine()){
            String navn = scan.nextLine();
            navnListe[teller] = navn;
            teller++;
        }

        int teller2 = 0;
        while (teller2 < navnListe.length){
            System.out.println("");

        }
    }
}