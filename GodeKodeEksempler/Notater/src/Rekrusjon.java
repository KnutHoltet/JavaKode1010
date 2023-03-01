public class Rekrusjon {
    public static void main(String[] args) {
        int resultat = sum(5, 10);
    }

    public static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end -1);
        }else{
            return end;
        }
    }
}