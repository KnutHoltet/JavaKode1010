public class MasterStudent extends Student implements Tilgang{
    public MasterStudent(String navn, int alder, String kurs, String laereSted){
        super(navn, alder, kurs, laereSted);
    }

    public boolean harTilgang(int tid){
        return true;
    }
}
