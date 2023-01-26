import java.util.HashMap;
public class Telefonbok3 {
    public static void main(String[] args) {
        Person pers = new Person("Knut", "34852345", "Osloveien 1");
        Person pers2 = new Person("Martin", "84128243", "Askerveien 1");
        Person pers3 = new Person("Bente", "83921032", "Kongensgate 1");

        HashMap<String, Person> folk = new HashMap<>();

        folk.put(pers.hentNavn(), pers);
        folk.put(pers2.hentNavn(), pers2);
        folk.put(pers3.hentNavn(), pers3);

        folk.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
