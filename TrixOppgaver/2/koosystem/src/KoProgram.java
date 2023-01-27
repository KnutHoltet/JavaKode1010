import java.util.Scanner;
public class KoProgram {
    public static void main(String[] args) {
        while (true){
            Scanner scan = new Scanner(System.in);
            KoSystem objekt = new KoSystem();
            System.out.println("**MENY FOR BILLETTSYSTEM**");
            System.out.println("1 - Trekk ny kolapp.");
            System.out.println("2 - Betjen kunde.");
            System.out.println("3 - Print antall kunder i kø.");
            System.out.println("4 - Avslutt.");
            int input = scan.nextInt();
            if (input == 1){
                objekt.trekkKoLapp();
                continue;
            }
            if (input == 2){
               objekt.betjenKunde();
               continue;
            }
            if (input == 3){
                objekt.printKunder();
            }
            if (input == 4){
                break;
            }
        }
    }
}
