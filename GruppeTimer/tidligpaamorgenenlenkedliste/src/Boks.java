public class Boks <E>{
    Node hode = null;
    public Boks(E data){
        hode = new Node(data);
    }

    public void settInn(E x){
        if (hode == null){
            hode = new Node(x);
            return;
        }
        Node next = hode;
        while(next.neste != null) next = next.neste;
        next.neste = new Node(x);
    }

    public class Node<E>{
        E data;
        Node neste = null;

        public Node(E data){
            this.data = data;
        }

        @Override
        public String toString(){
            String r = "";
            Node<E> n = this;
            while (n.neste != null) {
                r +=  n.data + " ";
                n = n.neste;
            }
            return r;
        }
    }
}
