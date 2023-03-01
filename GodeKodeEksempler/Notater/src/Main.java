public class Main {
    /*
    public static void main(String[] args) {
        Beholder<String> b = new Beholder<>();
        System.out.println(b);

        b.settInn("hei");
        System.out.println(b);

        Beholder<Loeve> loeveBeholder = new Beholder<>();

        Loeve<String> mufasa = new Loeve("Mufasa");
        System.out.println(loeveBeholder);
    }

     */
    public static void main(String[] args) {
        Koe<Loeve> loeveKoe = new Koe<>();
        //naar listen er tom, vi proever a kikke
        loeveKoe.kikk();




        Loeve mufasa = new Loeve("Mufasa");
        loeveKoe.settInn(mufasa);
        System.out.println(loeveKoe);

        Loeve scar = new Loeve("Scar");
        loeveKoe.settInn(scar);
        System.out.println(loeveKoe);


        //forventer mufasa
        System.out.println(loeveKoe.taUt());
        System.out.println(loeveKoe);

        //forventer scar
        System.out.println(loeveKoe.kikk());
        System.out.println(loeveKoe);




    }
}
