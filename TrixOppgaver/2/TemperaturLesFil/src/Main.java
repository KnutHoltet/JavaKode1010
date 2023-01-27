import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[12];
        int teller = 0;
        try{
            File f = new File("temperaturer.txt");
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine() && teller < 12){
                int temp = scan.nextInt();
                array[teller] = temp;
                teller++;
           }
            scan.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        for (int temp : array){
            System.out.println(temp);
        }
    }
}