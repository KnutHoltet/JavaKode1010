import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            ArrayList<Hund> hundListe = new ArrayList<>();
            ArrayList<Person> personListe = new ArrayList<>();
            File f = new File("navn.txt");
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                String type = data.substring(0, data.indexOf(" "));
                String navn = data.substring(data.indexOf(" "));
                if (type.equals("P")){
                    Person person = new Person(navn);
                    personListe.add(person);
                }else{
                    Hund hund = new Hund(navn);
                    hundListe.add(hund);
                }
            }

            System.out.println("Her kommer personer:");
            for(Person person : personListe){
                System.out.println(person.hentNavn());
            }

            System.out.println("Her kommer hunder:");
            for(Hund hund : hundListe){
                System.out.println(hund.hentNavn());
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}