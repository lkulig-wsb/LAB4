import LAB4_4.Widocznosc1;

public class Widocznosc4 extends Widocznosc1 {


    public static void main(String[] args){
        Widocznosc4 obj5 = new Widocznosc4();
       // Widocznosc4 obj5a = new Widocznosc4("test"); - Konstruktor domyślny nie będzie widoczny w klasie pochodnej.


        //Pole chronione stringChroniony z klasy Widocznosc1 jest widoczny w klasie dziedziczącej (Widocznosc4).
        System.out.println(" Pole chronione 'stringChroniony' jest widoczne w klasie pochodnej: " + obj5.stringChroniony);

        //Pole private z klasy bazowej Widocznosc1, nie będzie widoczne w klasie pochodnej Widocznosc4.
        //System.out.println(obj5.poleStringPriv);

        //Pole private z klasy bazowej będzie widoczne w klasie pochodnej za pomocą publicznej metody.
        //Tutaj widoczne za pomocą gettera.
        System.out.println(" Widoczność pola private tylko z pomocą publicznego gettera: " + obj5.getPoleStringPriv());
        //Pole z widocznością na public wyświetli się w klasie pochodnej.
        System.out.println("Pole publiczne typu int w klasie dziedziczącej: " + obj5.polePublicInt);
        //Metoda prywatna nie będzie widoczna w klasie pochodnej.
        //obj5.prywatnaMetoda();
        //Domyślna metoda nie będzie widoczna w klasie pochodnej.
        //obj5.domyslnaMetoda();
        //Metoda protected jest widoczna w klasie pochodnej.
        obj5.protectedMetoda();
        //Metoda public widoczna w klasie pochodnej.
        obj5.publicMetoda();
    }
}
