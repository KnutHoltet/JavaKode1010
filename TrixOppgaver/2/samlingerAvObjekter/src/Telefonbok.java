public class Telefonbok {
    public static void main(String[] args) {
        Person pers = new Person("Knut", "34852345", "Osloveien 1");
        Person pers2 = new Person("Per", "84128243", "Askerveien 1");
        Person pers3 = new Person("Bente", "83921032", "Kongensgate 1");


        Person[] myArray = new Person[10];

        myArray[0] = pers;
        myArray[1] = pers2;
        myArray[2] = pers3;

        int teller = 0;
        for (Person personer : myArray){
            if (teller < 3){
                System.out.println(personer.hentNavn());
                teller++;
            }
        }
    }
}
