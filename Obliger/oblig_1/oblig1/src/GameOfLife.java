import java.util.Scanner;
public class GameOfLife {
    public static void main(String[] args) {
        // Lager et scanner objekt
        Scanner scan = new Scanner(System.in);

        //Skriver system - melding
        System.out.println("Skriv antall rader:");
        int rad = scan.nextInt();

        System.out.println("Skriv antall kolonner:");
        int kol = scan.nextInt();

        Verden verden = new Verden(rad, kol);
        String readString = scan.nextLine();

        // While loop som fortsetter helt til den faar imput != enter
        while (readString!=null){
            // Enter returnerer en tom string
            if(readString.isEmpty()){
                verden.skrivUtGenNr();
                verden.tegn();
                verden.oppdatering();
                System.out.println("\nTrykk enter for aa kjore programmet, alt annet for aa stoppe");
            }else{
                break;
            }
            // Sjekker om bruker vil fortsette
            if (scan.hasNextLine()){
                readString = scan.nextLine();
            }
        }
    }
}
