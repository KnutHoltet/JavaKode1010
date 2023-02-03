public class Celle{
    public boolean levende;
    public Celle[] naboer;
    public int antNaboer;
    public int antLevendeNaboer;
    public Celle(){
        antNaboer = 0;
        antLevendeNaboer = 0;
        levende = false;
        naboer = new Celle[8];
    }

    public void settDoed(){
        levende = false;
    }

    public void settLevende(){
        levende = true;
    }

    public boolean erLevende(){
        return levende;
    }

    public char hentStatusTegn(){
        if(levende){
            return 'O';
        }
        return '.';
    }

    public void leggTilNabo(Celle celle){
        boolean sattInn = false;

        // Gjoer nearmeste ledig nabo om til celle
        while (antNaboer < naboer.length && !sattInn){
            //hvis det er ledig plass
            if(naboer[antNaboer] == null){
                naboer[antNaboer] = celle;
                //satt inn sann
                sattInn = true;
            }
        }

        //saa teller vi naboer
        antNaboer = 0;
        for(Celle cel : naboer){
            if(cel != null){
                antNaboer++;
            }
        }

    }

    public void tellLevendeNaboer(){
        antLevendeNaboer = 0;
        for (Celle celle : naboer) {
            if (celle != null && celle.levende) {
                antLevendeNaboer++;
            }
        }
    }

    public void oppdaterStatus(){
        // Sjekker status etter GAMEofLIFE regler
        if (levende){
            if (antLevendeNaboer == 2 || antLevendeNaboer == 3){
                levende = true;
            }else{
                levende = false;
            }
        }else{
           if (antLevendeNaboer == 3){
               levende = true;
           }
        }
    }
}