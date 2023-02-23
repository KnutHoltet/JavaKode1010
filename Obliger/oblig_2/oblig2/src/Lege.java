class Lege{
    String navn;
    public Lege(String navn){
        this.navn = navn;
    }

    public String toString(){
        return String.format("Legens-navn: %s", this.navn);
    }
}