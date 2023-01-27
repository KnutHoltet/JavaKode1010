import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try{
            File f = new File("tekst.txt");
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()){
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println("Noe gikk galt");
            e.printStackTrace();
        }
    }
}