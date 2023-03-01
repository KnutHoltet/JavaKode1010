/*
bruker T begge steder
vi mangler node pekere, lista maa minst ha en node beholder
maa ha en beholder for aa faa tak i andre beholdere kalles root node
 */
class Koe<T> implements Liste<T>{
    //instanse variabel beholder
    Beholder<T> rot; //kan hete Node<T> det er beholderen


    public String toString(){
        String string = "Koe";
        //lager en beholder som begynner paa rooten
        Beholder<T> beholder = rot;
        while (beholder != null){
            //returnere bare to objketet, saa her trenger iv en while loekke for aa legge dem itl i to string
            string += "\n" + beholder.toString();
            beholder = beholder.hentNeste();

            //string += rot.toString();
            //return string;
        }
        return string;
    }

    @Override
    public void settInn(T data){
        // Tenkt at vi tar aa bruker beholderen
        //if lista er tom
        Beholder<T> beholder = new Beholder<>();
        beholder.settInn(data);
        if (rot == null) {
            rot = beholder;
        }else{
            Beholder<T> siste = finnSiste();
            //soerge for at det siste elemntet sin peker peker paa det nye elementet som blir det siste som vi putter inn i koe
            siste.settNeste(beholder);

        }
        // sett inn data paa rot
        // sett inn data sist i lista
    }

    // finne siste elementet private til sett inn metoden
    private Beholder<T> finnSiste(){
        // vi begynner paa rooten
        Beholder<T> beholder = rot;
        //saa lenge denne beholderen sin neste, ikke er null
        // vi maa egentlig sjekke neste pekeren og ikke beholderen == null
        // tenk paa hvorfor vi maa gjoere dette
        while(beholder.harNeste()){
            beholder = beholder.hentNeste();
            //til slutt sitter vi med et obhekt som ikke har neste fordi da gaar vi ut av while loopen
        }
        return null;
    }

    @Override
    public T taUt(){
        // lager en temp, middlertidig peker
        Beholder<T> temp = rot;
        rot = rot.hentNeste();
        //vi skal ha det objketet som ligger inni beholderen
        return temp.hent();
    }

    @Override
    public T kikk(){
        //returnerer det som er foesrt i lista
        try{
            return rot.hent();
        }catch (NullPointerException e){
            System.out.println(e);
            return null;
        }
    }


    // er en indre klasse skriver ogsaa som kommentar
    /*
    Dette gjoer at vi ikke kan opprette noen beholdere enn i koe klassen,
    fordi det vil vi, vi vil kun behandle liste sitt grensesnitt
    Vi vil ikke ga inn i nodene aa manipulere de direkte
    Bare liste objektet som faar lov til aa haandtere disse beholderene
     */
    public class Beholder <T> {
        T innhold;
        Beholder<T> neste;

        @Override
        public String toString(){
            return String.format("Beholder: %s", innhold);
            //return "Beholder:" + innhold;
        }

        public boolean harNeste(){
            //boolean resultat = neste != null;
            return neste != null; //sparer en linje med kode
        }

        //returnere det som ligger i neste
        public Beholder<T> hentNeste(){
            return neste;
        }

        public void settNeste(Beholder<T> neste){
            this.neste = neste;
        }

        public void settInn(T innhold){
            this.innhold = innhold;
        }

        public T hent(){
            return innhold;
        }

    }
}
