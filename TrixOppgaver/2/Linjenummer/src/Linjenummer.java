import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Linjenummer {
    public static void main(String[] args) {
        try {
            File f = new File("tekst.txt");
            Scanner scan = new Scanner(f);
            int teller = 1;
            while(scan.hasNextLine()){
                System.out.println("# " + teller + ": " + scan.nextLine());
                teller++;
            }
        } catch(FileNotFoundException e){
            System.out.println("Noe gikk galt");
            e.printStackTrace();
        }

    }
}