import java.util.ArrayList;
public class Test{
    private ArrayList<Integer> myList = new ArrayList<>();

    public void addNumber(int number) {
        myList.add(number);
    }
    public void skrivUt(){
        System.out.println(myList);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.addNumber(2);
        test.skrivUt();

    }
}