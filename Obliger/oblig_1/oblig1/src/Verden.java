public class Verden {
    public int rad;
    public int kol;
    public int genNr;
    public Rutenett rutenett;
    public Verden(int rad, int kol){
        this.rad = rad;
        this.kol = kol;
        genNr = 0;

        // Lager et rutenett objekt
        rutenett = new Rutenett(this.rad, this.kol);

        // Fyller inn med celler
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();
    }

    public void tegn(){
        rutenett.tegnRutenett();
    }

    public void oppdatering(){
        for (int i = 0; i < this.rad; i++){
            for (int j = 0; j < this.kol; j++){
                // Henter celle og teller naboer
                Celle celle = rutenett.hentCelle(i, j);
                celle.tellLevendeNaboer();
            }
        }
        for (int i = 0; i < this.rad; i++){
            for (int j = 0; j < this.kol; j++){
                Celle celle = rutenett.hentCelle(i, j);
                celle.oppdaterStatus();
            }
        }

        // Husker aa oeke generasjonsnummeret
        genNr++;
    }

    // Metode for aa printe ut genNr
    public void skrivUtGenNr(){
        System.out.println(genNr);
    }

    // Metode for aa printe ut antall levende
    public void skrivUtAntallLevende(){
        System.out.println(rutenett.antallLevende());
    }
}
