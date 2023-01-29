public class test {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i++;
        }
        int lengde = myArray.length;
        System.out.println(lengde);
    }
}
