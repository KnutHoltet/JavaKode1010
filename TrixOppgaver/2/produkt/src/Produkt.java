import java.util.Scanner;
public class Produkt{
   public static void main(String[]args) {
       Scanner scan = new Scanner(System.in);
       int innTall = scan.nextInt();
       int innTall2 = scan.nextInt();
       int resultat = innTall * innTall2;
       System.out.println(resultat);
       // differanse mellm tall
       System.out.println("______");

       int tall1 = scan.nextInt();
       int tall2 = scan.nextInt();
       int differsanse = tall1 - tall2;

       // sjekker om det er negativt eller positivt
       if (differsanse < 0){
           System.out.println("tallet er negativt");
       }else{
           System.out.println("Tallet er positivt");
       }

   }
}
