public class Loeve <T>{
    T innhold;

    public Loeve(T innhold){
        this.innhold = innhold;
    }
    @Override
    public String toString(){
        return "Navn: " + innhold;
    }

    public T hent(){
        return innhold;
    }
}
