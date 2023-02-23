class Professor extends Forsker{
    String kurs;
    public Professor(String navn, int alder, int timeloenn, String fagomraade, String kurs){
        super(navn, alder, timeloenn, fagomraade);
        this.kurs = kurs;
    }
}
