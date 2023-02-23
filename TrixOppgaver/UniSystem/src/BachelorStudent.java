class BachelorStudent extends Student implements Tilgang{
    public BachelorStudent(String navn, int alder, String kurs, String laereSted){
        super(navn, alder, kurs, laereSted);
    }

    public boolean harTilgang(int tid){
        int aapning = 7;
        int stengt = 21;
        if (tid >= aapning && tid <= stengt){
            return true;
        }
        return false;
    }
}
