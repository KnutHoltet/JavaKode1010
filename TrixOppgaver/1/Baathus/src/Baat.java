class Baat{
    private static int antProd = 0;
    private int prodnr;
    private String merke;

    public Baat(String mrk){
        prodnr = antProd;
        antProd++;
        merke = mrk;
    }
    public String hentInfo(){
        return "Produksjonsnummer: " + prodnr + ", merke: " + merke;
    }
}

class Baathus{
    private Baat[] baater;
    int antallPlasser;
    public Baathus(int antallPlasser){
        this.antallPlasser = antallPlasser;
        baater = new Baat[this.antallPlasser];
    }
    public void settInn(Baat objekt){
        boolean listFull = true;
        for(int i = 0; i < baater.length; i++){
            if (i != 0) {
                listFull = false;
            }
        }
        int counter = 0;
        if (listFull){
            System.out.println("Listen er full");
        }else{
            for(int i = 0; i < baater.length; i++){
                if (baater[i] != null){
                }else{
                    if (counter == 0){
                        baater[i] = objekt;
                        counter++;
                    }
                }
            }
        }
    }
    public void skrivBaater(){
        for (Baat baat : baater) {
            if (baat != null){
                System.out.println(baat.hentInfo());
            }

        }
    }
}
