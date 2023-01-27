public class Main{
    public static void main(String[] args) {
        int[] myArray = {0,1,2,3,4,5};
        // metode 1
        for (int tall: myArray){
            System.out.println(tall);
        }
        System.out.println("-----");
        // metode 2
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println("----");

        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++){
            array2[i] = myArray[i];
            System.out.println(array2[i]);
        }



    }
}