package LAB4_4;

public class Widocznosc1 {

    //Pola prywatne widoczne wyłącznie w obrębie tej klasy
    private String poleStringPriv = " private String poleString";
    private int poleIntPriv = 44;
    //Pole z dostępem domyślny, widoczne w obrębie pakietu.
    double domyslnyDouble = 3.14;
    //Chroniony dostęp - pole dostępne w obrębie pakietu i w klasach pochodnych
    protected String stringChroniony = "To jest string chroniony!";
    protected int intChroniony = 555;
    //Pola public - widoczne wszędzie;
    public int polePublicInt = 2023;
    public String polePublicString = "To jest pole typu String z widocznością ustawioną na public.";

    //Konstruktory i ich widoczność.

    //Publiczny konstruktor widoczny wszędzie.
    public Widocznosc1(){
        System.out.println("Jestem Konstruktor Publiczny!");
    }

    //Domyślny konstruktor widoczny wyłącznie w pakiecie.
    Widocznosc1(String tekst){
        System.out.println("Jestem Kontruktor Domyślny!");
    }

    //Protected Konstruktor jest widoczny w klasie w której został utworzony, w pakiecie i klasach pochodnych.
    protected Widocznosc1(int x){
        System.out.println("Jestem Konstruktor Protected!");
    }
    //Konstruktor Private dostępny tylko w tej klasie w której został utworzony.
    private Widocznosc1(double z){
        System.out.println("Jestem Konstruktor Private!");
    }


    //Metody i ich widoczność
    //Prywatna metoda dostępna wyłącznie w danej klasie.
    private void prywatnaMetoda(){
        System.out.println("Jestem metodą prywatną :-/");
    }
    //Domyślna metoda jest widoczna w pakiecie.
    void domyslnaMetoda(){
        System.out.println("Jestem metodą domyślną :-|");
    }
    //Metoda z widocznością typu protected będzie dostępna w pakiecie i klasach dziedziczących.
    protected void protectedMetoda(){
        System.out.println("Jestem metodą typu protected :->");
    }
    //Metoda publiczna będzie widoczna wszędzie.
    public void publicMetoda(){
        System.out.println("Jestem metoda public. Jestem wszędzie widoczna :-)");
    }

    //Gettery do wyświetlenia prywatnych pól.

    public String getPoleStringPriv(){
        return poleStringPriv;
    }
    public int getPoleIntPriv(){
        return poleIntPriv;
    }
    public double getDomyslnyDouble(){
        return domyslnyDouble;
    }

    public static void main(String[] args){

        //Utworzenie obiektu klasy.
        Widocznosc1 obj1 = new Widocznosc1();
        Widocznosc1 obj1a = new Widocznosc1("Tekst");
        Widocznosc1 obj1b = new Widocznosc1(5);
        Widocznosc1 obj1c = new Widocznosc1(3.14);

        //Bepośrednie wyświetlenie prywatnego pola.
        System.out.println("poleStringPriv: " + obj1.poleStringPriv);
        System.out.println("poleIntPriv: " + obj1.poleIntPriv);

        //Wyświetlenie za pomocą getterów.
        System.out.println("Pole Private String: " + obj1.getPoleStringPriv());
        System.out.println("Pole Private Int: " + obj1.getPoleIntPriv());

        //Pole protected w obrębie tej samej klasy zostanie wyświetlone.
        System.out.println("Pole protected w tej samej klasie: " + obj1.stringChroniony);

        //Wyświetlenie pola typu public w tej samej klasie.
        System.out.println("polePublicString: " + obj1.polePublicString);
        System.out.println("PolePublicInt: " + obj1.polePublicInt);
        //Metode prywatną wyświetlimy tylko w obrębie danej klasy.
        obj1.prywatnaMetoda();
        //Domyślna metoda widoczna w tej samej klasie.
        obj1.domyslnaMetoda();
        //Metoda public widoczna w tej samej klasie.
        obj1.publicMetoda();
        //Konstruktory



    }
}
