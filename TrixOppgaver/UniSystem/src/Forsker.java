class Forsker extends Ansatt{
    String fagomraade;
    public Forsker(String navn, int alder, int timeloenn, String fagomraade){
        super(navn, alder, timeloenn);
        this.fagomraade = fagomraade;
    }
}
