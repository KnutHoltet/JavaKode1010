public class Main {
    public static void utskrift(String tekst){
        System.out.println(tekst);
    }

    public static void utskrift(int tall, int tall2){
        System.out.println(tall + tall2);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.utskrift("hei");
        main.utskrift(2, 2);
    }
}