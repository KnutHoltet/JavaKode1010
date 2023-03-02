//abstract class LenkeListe <E> implements liste <E>
abstract class Lenkeliste <E> implements Liste<E>{
    Node<E> rot;

    public E hent(){
        if (rot.harNeste()){
            return rot.hentInnhold(); // returnerer innholdet i noden
        }
        return null;
    }

    public E fjern(){
        Node<E> temp = rot;
        if(temp.harNeste()){
            rot = rot.hentNeste();
        }
        return temp.hentInnhold();
    }

    public int stoerrelse(){
        Node<E> node = rot;
        int teller = 0;
        while(node != null){
            teller++;
            node = node.hentNeste();
        }
        return teller;
    }

    public void leggTil(E x){
        Node<E> node = new Node();
        node.settInn(x);
        if(rot == null){
            rot = node;
        }else{
            Node<E> siste = finnSiste();
            siste.settNeste(node);
        }
    }

    public Node<E> finnSiste(){
        Node<E> node = rot;
        if (node != null){
            while(node.harNeste()){
                node = node.hentNeste();
            }
        }
        return node;
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

        public E hentInnhold(){
            //Henter objektet
            return data;
        }

        public Node<E> hentNeste(){
            return neste;
        }
    }
}
