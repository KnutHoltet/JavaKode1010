import java.util.Scanner;
import java.util.HashMap;
public class Telefonbok{
    public static void main(String[]args){
        HashMap<String, String> telefonbok = new HashMap<>();
        telefonbok.put("Arne", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97979797");
        telefonbok.put("Peder", "213456789");
        Scanner scan = new Scanner(System.in);

        boolean funnet = false;
        while (funnet != true){
            String navn = scan.nextLine();
            if (telefonbok.containsKey(navn)){
                System.out.println(telefonbok.get(navn));
                funnet = true;
            }
        }
        telefonbok.forEach((key, value) -> System.out.println(key + " : " + value));
        telefonbok.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}