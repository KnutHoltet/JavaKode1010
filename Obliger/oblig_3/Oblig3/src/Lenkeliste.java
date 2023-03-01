abstract class Lenkeliste <E> implements Liste <E>{
    Node<E> rot = new Node<E>();

    public E hent(int pos){
        //Todo
        return null;
    }

    public E fjern(int pos){
        //Todo
        return null;
    }

    public int storrelse(){
        //Todo
        return 1;
    }

    public void leggTil(int pos, E x){
        //Todo
    }


    // Node
    public class Node <E>{
        E data;
        Node<E> neste;

        public boolean harNeste(){
            return neste != null;
        }

        public void settNeste(Node<E> neste){
            this.neste = neste;
        }

        public void settInn(E innhold){
            data = innhold;
        }

        public E hent(){
            //Henter objektet
            return data;
        }
    }
}
