import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int listNum = 0;
        while(true) {  //each run
            int animals = Integer.parseInt(sc.nextLine());
            if (animals == 0)
                return;

            HashMap<String, Integer> hmap = new HashMap<String, Integer>();
            ArrayList<String> arrlst = new ArrayList<String>();
            for (int i = 0; i < animals; i++) {                 //read in everything
                String[] animal = sc.nextLine().split(" ");
                animal[animal.length-1] = animal[animal.length-1].toLowerCase();
                if (!hmap.containsKey(animal[animal.length-1])) { //if hmap doesn't have animal yet
                    hmap.put(animal[animal.length - 1], 1);       //add 1
                    arrlst.add(animal[animal.length-1]);
                }
                else {                                            //else add 1
                    int temp = hmap.get(animal[animal.length - 1]);
                    hmap.replace(animal[animal.length - 1], temp + 1);
                }
            }
            System.out.println("List " + ++listNum + ":");
            Collections.sort(arrlst);

            for(String s:arrlst){
                System.out.println(s + " | " + hmap.get(s));
            }
        }
    }
}