import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] liste = new String[4];
        boolean[] liste2 = new boolean[4];

        for(int i = 0; i < 4; i++){
            liste[i] = "Knut";
        }
        int teller = 0;
        while (teller < liste.length){
            System.out.println("har : " + liste[teller] + " moett?" );
            boolean moett = scan.nextBoolean();
            liste2[teller] = moett;
            teller++;
        }

        for (String s : liste){
            System.out.println(s);
        }
        for (boolean b : liste2){
            System.out.println(b);
        }
    }
}