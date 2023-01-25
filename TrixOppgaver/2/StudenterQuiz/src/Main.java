public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Joakim", 4, 2);
        Student student2 = new Student("Kristin", 11, 5);
        Student student3 = new Student("Dag", 7, 6);

        // foer lagt til quiz score
        System.out.println(student1.hentTotalScore());
        System.out.println(student2.hentTotalScore());
        System.out.println(student3.hentTotalScore());

        System.out.println("_____");

       //etter lagt til quiz score
        student1.leggTilQuizScore(2);
        student2.leggTilQuizScore(2);
        student3.leggTilQuizScore(2);


        System.out.println(student1.hentTotalScore());
        System.out.println(student2.hentTotalScore());
        System.out.println(student3.hentTotalScore());
    }
}
