public class Main {
    public static void main(String[] args) {
        EspressoMaskin maskin = new EspressoMaskin(1000);
        System.out.println(maskin.hentVannmengde());
        maskin.lagEspresso();
        maskin.lagEspresso();
        maskin.lagLungo();
        maskin.skrivUtKaffe();

        System.out.println(maskin.hentVannmengde());
    }
}