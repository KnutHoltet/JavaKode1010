import java.util.HashMap;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        HashMap<Integer, Integer> matvarer = new HashMap<>();
        int broed = 20;
        int melk = 15;
        int ost = 40;
        int yoghurt = 12;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hei! Velkommen til IFI-butikken." + "\n" + "Hvor mange broed vil du ha?");
        int antallBroed = scan.nextInt();
        matvarer.put(broed, antallBroed);

        System.out.println("Hvor mange melk vil du ha?");
        int antallMelk = scan.nextInt();
        matvarer.put(melk, antallMelk);

        System.out.println("Hvor mange ost vil du ha?");
        int antallOst = scan.nextInt();
        matvarer.put(ost, antallOst);

        System.out.println("Hvor mange yoghurt vil du ha?");
        int antallYoghurt = scan.nextInt();
        matvarer.put(yoghurt, antallYoghurt);

        int sum = 0;
        /*
        proevde aa finne en maate aa gjoere det i en loop men orker ikke,
        bare gjoer det manuelt for aa loese oppgaven
         */
        for(int i : matvarer.values()){

        }



    }
}