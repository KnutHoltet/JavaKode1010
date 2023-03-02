public class Main {
    public static void main(String[] args) {
        Boks<String> hode = new Boks("Per");
        hode.settInn("Knut");
        hode.settInn("Ola");

        System.out.println(hode);
    }
}