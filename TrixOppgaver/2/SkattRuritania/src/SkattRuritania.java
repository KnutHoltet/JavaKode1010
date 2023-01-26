import java.util.Scanner;
public class SkattRuritania {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double inntekt = scan.nextDouble();

       if (inntekt < 10000){
           System.out.println("Du maa betale kr: " + (inntekt * 0.10) + " i skatt.");
       } else if (inntekt >= 10000) {
          double skatt = ((inntekt - 10000) * 0.3) + (10000 * 0.1);
           System.out.println("Du maa betale kr: " + skatt + " i skatt.");
       }
    }
}