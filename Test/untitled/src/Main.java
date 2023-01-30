public class Main {
    public static void main(String[] args) {
        String test = "P Svein";
        String[] parts = test.split(" ");
        for(String part : parts){
            System.out.println(part);
        }


        String s = "14.015_AUDI";
        String firstPart = s.substring(0, s.indexOf("_"));
        System.out.println(firstPart);
    }
}