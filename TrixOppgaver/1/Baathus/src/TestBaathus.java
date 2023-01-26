public class TestBaathus {
    public static void main(String[] args) {
        Baathus baathus = new Baathus(2);
        Baat baat = new Baat("Baat1");
        Baat baat2 = new Baat("Baat2");
        baathus.settInn(baat);
        baathus.settInn(baat2);
        baathus.skrivBaater();
    }
}
