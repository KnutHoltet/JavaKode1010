import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
public class Main{
    public static void main(String[] args) {
        File f = new File("navn.txt");
        Scanner filLeser = null;
        HashMap<String, ArrayList<String>> studentOgFag = new HashMap<>();
        try{
            filLeser = new Scanner(f);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        String fag = "";
        while(filLeser.hasNextLine()){
            String data = filLeser.nextLine();
            String stjerne = data.substring(0, 1);
            if(stjerne.equals("*")){
                ArrayList<String> liste = new ArrayList<>();
                fag += data;
                studentOgFag.put(data, liste);
                System.out.println(fag + " fra stjerne");
            }
            if(!stjerne.equals("*")){
                /*
                ArrayList<String> values = studentOgFag.get(fag);
                values.add(data);
                studentOgFag.put(fag, values);
                 */
                System.out.println(fag + " fra ikke stjerne");
            }
        }
        System.out.println(studentOgFag);

        System.out.println(studentOgFag);
    }
}