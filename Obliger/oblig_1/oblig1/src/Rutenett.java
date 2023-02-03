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

    public void settNaboer(int rad, int kol) {
        // Cellen  sjekker
        Celle celle = hentCelle(rad, kol);
        // Sjekker selve raden, over og under
        for (int i = -1; i < 2; i++){
            // Sjekker ruten ved siden av, over og under
            for (int j = -1; j < 2; j++){
                // Hvis det ikke er selve ruta
                if (hentCelle(i, j) != null){
                    // Og indeks ikke er out of bounds
                    if (hentCelle(i,j) != celle){
                        // Legg til nabo
                        Celle nabo = hentCelle(i,j);
                        celle.leggTilNabo(nabo);
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
