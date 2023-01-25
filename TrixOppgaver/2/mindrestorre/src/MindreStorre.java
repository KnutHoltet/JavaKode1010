import java.util.Scanner;
public class MindreStorre{
    public static void main(String[]args){
        // a
        Scanner scan = new Scanner(System.in);
        int innTall = scan.nextInt();
        if (innTall < 10){
            System.out.println("Tallet er mindre enn 10.");
        }
        else if(innTall < 20){
            System.out.println("Tallet er mindre enn 20.");
        }
        else if(innTall > 20){
            System.out.println("Tallet er stoerre enn 20.");
        }


    }
}