import LAB4_4.Widocznosc1;

public class Widocznosc3 {
    public static void main(String[] args){
        Widocznosc1 obj3 = new Widocznosc1();

        //Pole domyslny double nie będzie widoczne ponieważ klasa Widocznosc3 nie jest w tym samym
        //pakiecie co klasa Widocznosc1.
        //System.out.println("Domyślny double, widoczny w pakiecie: " + obj3.domyslnyDouble);

        //Domyslne pole domyslnyDouble będzie widoczne za pomocą publicznego gettera.
        System.out.println(" domyslnyDouble widoczny przy pomocy gettera: " +obj3.getDomyslnyDouble());
        //Wyświetlanie pola public w innej klasie.
        System.out.println("Pole public wyświetlane w innej klasie: " + obj3.polePublicInt);
        //Prywatna metoda nie będzie widoczna w innej klasie.
        //obj3.prywatnaMetoda();
        //Metoda protected nie będzie widoczna w innej klasie.
        //obj3.protectedMetoda();
        //Metoda public widoczna w innej klasie.
        obj3.publicMetoda();
    }
}
