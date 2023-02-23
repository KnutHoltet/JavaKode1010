class Student extends Person{
    String kurs;
    String laereSted;
    public Student(String navn, int alder, String kurs, String laereSted){
        super(navn, alder);
        this.kurs = kurs;
        this.laereSted = laereSted;
    }
}
