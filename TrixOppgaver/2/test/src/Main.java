import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args) {
        File f = new File("navn.txt");
        Scanner filleser = null;
        try{
            filleser = new Scanner(f);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        String fag = "";
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        while(filleser.hasNextLine()){
            String data = filleser.nextLine();
            String foeresteIndeks = data.substring(0, 1);
            if(foeresteIndeks.equals("*")){
                fag = data;
                ArrayList<String> liste = new ArrayList<>();
                map.put(fag, liste);
            }else{
                ArrayList<String> values = map.get(fag);
                values.add(data);
                map.put(fag, values);

            }

        }
        System.out.println(map);

    }
}
