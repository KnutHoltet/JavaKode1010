import java.util.HashMap;
/*
Gjoer alt i main slik at jeg slipper aa lage flere filer
du skal uansett bare returnere noe hvis x-person eksisterer i listen
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> studenter = new HashMap<>();
        studenter.put("Espen Askeladd", 18);
        //boolean som skal representere det jeg hadde returnert i en metode
        boolean eksisterer = true;


        if(studenter.containsKey("Espen Askeladd")){
            System.out.println(eksisterer);
        }
    }
}