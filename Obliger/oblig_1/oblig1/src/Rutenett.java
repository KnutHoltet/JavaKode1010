public class Rutenett {
    public int antRader;
    public int antKolonner;
    public Celle[][] rutene;
    public Rutenett(int antRader, int antKolonner){
        this.antRader = antRader;
        this.antKolonner = antKolonner;
        rutene = new Celle[antRader][antKolonner];
    }

    public void lagCelle(int rad, int kol){
        Celle celle = new Celle();

        // Gjoer celle levende etter sannsynlighet
        if (Math.random() <= 0.3333){
            celle.settLevende();
        }
        rutene[rad][kol] = celle;
    }

    public void fyllMedTilfeldigeCeller(){
        // Itererer gjennom rutenettet og lager celler
        for (int i = 0; i < rutene.length; i++){
            for (int j = 0; j < rutene[i].length; j++){
                lagCelle(i, j);
            }
        }
    }

    public Celle hentCelle(int rad, int kol){
        // Returnerer null, dersom indeks er ute av range
        if ((rad < 0 || kol < 0) || (rad > rutene.length-1 || kol > rutene[0].length-1)){
            return null;
        }
        return rutene[rad][kol];
    }

    public void tegnRutenett(){
        // Itererer gjennom og printer ut tegn
        for (Celle[] rad : rutene) {
            System.out.println();
            for (Celle kol : rad) {
                System.out.print(kol.hentStatusTegn());
            }
        }
    }

    public void settNaboer(int rad, int kol){
        Celle celle = hentCelle(rad, kol);

        // Begynnelsen av aa iterere gjennom radene
        for (int i = 0; i < rutene.length; i++){

            // Sjekker selve raden, over og under
            if(i == rad || i == (rad+1) || i == (rad-1)){

                // Begynnelsen av iterere gjennom kolonnene
                for (int j = 0; j < rutene[i].length; j++){

                    // Sjekker ruten til venstre, hoeyre, over og under
                    if(j == kol || j == (kol+1) || j == (kol-1)){

                        // Dersom det ikke er selve ruten
                        if(i != rad || j != kol){

                            // Hent cellen som er ikke er utenfor indeksen
                            if(hentCelle(i,j) != null){
                                Celle nabo = hentCelle(i,j);
                                celle.leggTilNabo(nabo);
                            }
                        }
                    }
                }
            }
        }
    }

    public void kobleAlleCeller(){
        // Itererer gjennom rutenettet
        for (int i = 0; i < rutene.length; i++){
            for (int j = 0; j < rutene[i].length; j++){
                settNaboer(i, j);
            }
        }
    }

    public int antallLevende(){
        int teller = 0;
        for(Celle[] rad : rutene){
            for(Celle celle : rad){
                if(celle.erLevende()){
                    teller++;
                }
            }
        }
        return teller;
    }




}
