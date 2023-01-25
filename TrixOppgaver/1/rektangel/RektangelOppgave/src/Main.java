class Rektangel{
    private double l;
    private double b;
    public Rektangel(double l, double b){
        this.l = l;
        this.b = b;
    }
    public void oekLengde(int okning){
       this.l += okning;
    }
    public void reduserLengde(int redus){
        this.l -= redus;
    }
    public void oekBredde(int okning){
       this.b += okning;
    }
    public void reduserBredde(int redus){
        this.b -= redus;
    }
    public double areal(){
       double areal = this.l * this.b;
       return areal;
    }
    public double omkrets(){
       double omkrets = 2*(this.l) + 2*(this.b);
       return omkrets;
    }
    public double getL(){
        return this.l;
    }
    public double getB(){
        return this.b;
    }
}

public class Main{
    public static void main(String[]args){
        Rektangel rektangel = new Rektangel(2.2, 3.3);
        // tester areal metodene
        double areal = rektangel.areal();
        double omkrets = rektangel.omkrets();
        System.out.println("Areal er: " + areal + " Omkrets er: " + omkrets);
        // tester okning og redusering
        System.out.println("Lengde: " + rektangel.getL() + " Bredde " + rektangel.getB());
        //  oeker foerst
       rektangel.oekLengde(2);
       rektangel.oekBredde(3);
       System.out.println("Lengde: " + rektangel.getL() + " Bredde " + rektangel.getB());

        // saa reduserer
        rektangel.reduserLengde(4);
        rektangel.reduserBredde(7);
        double lengde = rektangel.getL();
        double bredde = rektangel.getB();
        System.out.println("Lengde: " + rektangel.getL() + " Bredde " + rektangel.getB());

    }
}