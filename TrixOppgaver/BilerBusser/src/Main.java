import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<Kjoretoy> liste = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (input.isEmpty()){
            System.out.println("Skriv inn type bil du vil registrere: ");
            String bilType = sc.nextLine();
            System.out.println("Skriv inn regNr: ");
            String regNr = sc.nextLine();
            System.out.println("Skriv inn merke: ");
            String merke = sc.nextLine();
            System.out.println("Skriv inn eier: ");
            String eier = sc.nextLine();
            if(sc.nextLine() == "buss"){
                System.out.println("Skriv inn antall sitteplasser: ");
                int antSitte = sc.nextInt();
                Buss bus = new Buss(regNr, merke, eier, antSitte);
                liste.add(bus);
            }
            if(input == "personbil"){
                int antSitte = sc.nextInt();
                Personbil bil = new Personbil(regNr, merke, eier, antSitte);
                liste.add(bil);
            }

            if(input == "varebil"){
                System.out.println("Skriv inn maks vekt:");
                int maksVekt = sc.nextInt();
                Varebil varebil = new Varebil(regNr, merke, eier, maksVekt);
                liste.add(varebil);
            }
        }
    }
}