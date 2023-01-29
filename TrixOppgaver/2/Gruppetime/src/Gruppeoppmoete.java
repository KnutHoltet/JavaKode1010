import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Gruppeoppmoete {
    private String[] navnListe = new String[17];
    private boolean[] oppmoete = new boolean[17];

    public void lesInn(){
        try {
            File f = new File("liste.txt");
            Scanner scan = new Scanner(f);
            int teller = 0;
            while (scan.hasNextLine()) {
                String navn = scan.nextLine();
                navnListe[teller] = navn;
                teller++;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void registrerOppmoete(){
        Scanner scan = new Scanner(System.in);
        int teller = 0;
        while(teller < navnListe.length){
            System.out.println("Har : " + navnListe[teller] + " moett opp? true/false");
            boolean moett = scan.nextBoolean();
            oppmoete[teller] = moett;
            teller++;
        }
    }

    public void skrivUt(){
        int teller = 0;
        while (teller < navnListe.length){
            if (oppmoete[teller]){
                System.out.println(navnListe[teller] + " har moett!");
            }
            teller++;
        }
    }

    public static void main(String[] args) {
        Gruppeoppmoete gruppe = new Gruppeoppmoete();
        gruppe.lesInn();
        gruppe.registrerOppmoete();
        gruppe.skrivUt();

    }
}