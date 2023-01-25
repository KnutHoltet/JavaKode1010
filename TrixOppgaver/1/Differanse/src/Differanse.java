import javax.swing.*;
import java.util.Scanner;
import static javax.swing.JOptionPane.*;
public class Differanse{
    public static void main(String[] args) {
        // metode 1
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(input);
        //metode 2
        String input2 = JOptionPane.showInputDialog("Skriv inn noe boi");
        System.out.println(input2);
        int tall1 = Integer.parseInt(input);
        int tall2 = Integer.parseInt(input2);
        int resultat = tall1 - tall2;
        System.out.println(resultat);

    }


}