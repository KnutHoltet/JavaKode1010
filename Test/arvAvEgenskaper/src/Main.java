class A{
    public void skrivKlasse(){
        System.out.println("Du er i klasse A");
    }
}

class B extends A{
    public void skrivKlasse(){
        System.out.println("Du er i klasse B");
    }
}

public class Main{
    public static void main(String[] args) {
        B b = new B();
        A b2 = b;
        b.skrivKlasse(); // det som skjer er at den kaller på metoden i klasse B
        b2.skrivKlasse();
    }
}

