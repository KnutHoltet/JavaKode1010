class Skyskraper extends Bygning{
    int antallEtasjer;
    public Skyskraper(double bruttoAreal, int antallEtasjer){
        super(bruttoAreal);
        this.antallEtasjer = antallEtasjer;
    }

    @Override
    public String toString(){
        return String.format(
                "Dette er en skyskraper med areal: %s 'og' %s antall etasjer", this.bruttoAreal, this.antallEtasjer
        );
    }
}
