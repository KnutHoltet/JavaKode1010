public class Student{
    private String navn;
    private int quizScore;
    private int antallQuiz;
    public Student(String navn, int quizScore, int antallQuiz){
        this.navn = navn;
        this.quizScore = quizScore;
        this.antallQuiz = antallQuiz;
    }

    public String hentNavn(){
        return this.navn;
    }
    public void leggTilQuizScore(int score){
       this.quizScore += score;
       this.antallQuiz += 1;
    }
    public int hentTotalScore(){
        return quizScore;
    }
    public int hentGjennomsnittligScore(){
        int out = quizScore / antallQuiz;
        return out;

    }
}