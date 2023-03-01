public class Main {
    private static void sjekk(boolean test) {
        if (!test) {
            System.out.println("Student har ikke tilgang");
        } else {
            System.out.println("Student har tilgang");
        }
    }

    public static void main(String[] args) {
        BachelorStudent stud = new BachelorStudent("Knut", 20, "Design", "IFI");
        MasterStudent stud2 = new MasterStudent("Per", 25, "Prosa", "IFI");

        sjekk(stud.harTilgang(2));
        sjekk(stud2.harTilgang(2));
    }
}