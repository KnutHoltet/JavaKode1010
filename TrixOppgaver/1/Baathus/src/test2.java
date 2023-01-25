import java.util.Scanner;
public class test2 {
   public static void main(String[]args) {
       Scanner scanObjkt = new Scanner(System.in);
       System.out.println("Enter username");

       String userName = scanObjkt.nextLine();
       System.out.println("Username is: " + userName);
   }
}
