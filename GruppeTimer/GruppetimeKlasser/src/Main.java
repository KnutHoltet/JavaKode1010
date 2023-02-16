import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
// Maa vaere foreldre klassen
abstract class Firkant{
    /*
    Typisk skriver man protected for aa vaere klar paa hva man oensker
     */
    int a;
    int b;
    int c;
    int d;

    public Firkant(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int omkrets(){
        return a+b+c+d;
    }

    // Maa implementeres i subklasser
    public abstract int areal();

    @Override
    public String toString(){
        return String.format(" med areal: %s   Omkrets: %s", areal(), omkrets());
    }
}

class Rektangel extends Firkant{
    int bredde;
    public Rektangel(int lengde, int bredde){
        /*
        Super maa alltid vaere paa starten av klassen
         */
        super(lengde, bredde, lengde, bredde);
        // Du kan ha this.verdier under super
    }


    /*
    Kan gjoeres paa denne maaten, fordi den vet om de variablene i firkant klassen

     */
    @Override
    public int areal(){
        return a*b;
    }

    @Override
    public String toString(){
        return "Rektangel" + super.toString();
    }
}

class Kvadrat extends Rektangel{
    /*
    Denne arver fra rektangel
     */
    public Kvadrat(int sideLengde){
        super(sideLengde, sideLengde);
    }
    /*
    @Override
    public String toString(){
        //Plusser paa toStringen fra overklassen
        return "Kvadrat" + super.toString();
    }
     */
}

public class Main{
    public static void main(String[] args) {
        ArrayList<Firkant> liste = new ArrayList<>();
        /*

         */
        try{
            Scanner scan = new Scanner(
                    new FileReader(args[0])
            );

            String linje = "";
            while(scan.hasNext()){
                linje = scan.nextLine();
                String[] lb = linje.split(",");
                // new Rektangel(Integer.parseInt(lb[0]), Integer.parseInt(lb[1]))
                int lengde = Integer.parseInt(lb[0]);
                int bredde = Integer.parseInt(lb[1]);
                if (lengde == bredde){
                    liste.add(
                            new Kvadrat(lengde)
                    );
                }else{
                    new Rektangel(lengde, bredde);
                }
            }
            scan.close();

        }catch (FileNotFoundException fnfe){
            System.out.println("Fant ikke filen");
        }

        // Printer ut arraylist
        for(Firkant f : liste) System.out.println(f);
    }
}



