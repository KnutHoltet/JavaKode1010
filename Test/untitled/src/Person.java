public class Person {
    public String navn;
    public Person(String navn){
        this.navn = navn;
    }

    public String hentNavn(){
        return this.navn;
    }
}
