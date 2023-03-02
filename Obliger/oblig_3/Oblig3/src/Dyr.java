public class Dyr <E>{
    E type;
    public void settType(E type){
        this.type = type;
    }

    public E hent(){
        return type;
    }
}
