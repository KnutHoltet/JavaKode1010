public class Station {
    public static void main(String[] args) {
        Car bil = new Car("BMW", "AC 1239891");
        //bil.settInnString("s");
        //bil.settInnString("x");
        bil.printBikes();
        bil.printStringListe();

        int[][] liste = new int[2][2];
        liste[0][0] = 1;
        liste[0][1] = 2;
        liste[1][0] = 3;
        liste[1][1] = 4;

        for (int[] rad : liste){
            for (int celle : rad){
                celle = 0;
            }
        }

        for (int[] rad : liste){
            for (int celle : rad){
                System.out.println(celle);
            }
        }
    }
}
