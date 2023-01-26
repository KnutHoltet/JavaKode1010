import java.util.ArrayList;
public class Telefonbok2 {
    public static void main(String[] args) {
        Person pers = new Person("Knut", "34852345", "Osloveien 1");
        Person pers2 = new Person("Per", "84128243", "Askerveien 1");
        Person pers3 = new Person("Bente", "83921032", "Kongensgate 1");

        ArrayList<Person> array = new ArrayList<>();

        array.add(pers);
        array.add(pers2);
        array.add(pers3);

        for (Person personer : array){
            System.out.println(personer.hentNavn());
        }
    }
}
