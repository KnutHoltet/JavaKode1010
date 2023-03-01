import java.util.*;
import java.util.Iterator;
public class Iterasjon{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Knut");
        list.add("Per");
        ListIterator<String> iterator = list.listIterator();
        if(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
