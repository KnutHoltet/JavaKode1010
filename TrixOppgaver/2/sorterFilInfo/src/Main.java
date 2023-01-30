import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            ArrayList<String> hundListe = new ArrayList<>();
            ArrayList<String> personListe = new ArrayList<>();
            File f = new File("navn.txt");
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                String type = data.substring(0, data.indexOf(" "));
                String navn = data.substring(data.indexOf(" "));
                if (type.equals("P")){
                    personListe.add(navn);
                }else{
                    hundListe.add(navn);
                }
            }

            System.out.println("Her kommer personer:");
            for(String person : personListe){
                System.out.println(person);
            }

            System.out.println("Her kommer hunder:");
            for(String hund : hundListe){
                System.out.println(hund);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}