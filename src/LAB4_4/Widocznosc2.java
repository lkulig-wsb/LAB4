package LAB4_4;

public class Widocznosc2 {

    public Widocznosc2(double z){
        super();
    }
    public static void main(String[] args){

        Widocznosc1 obj2 = new Widocznosc1();
        Widocznosc1 obj2a = new Widocznosc1("Tekst");
        Widocznosc1 obj2b = new Widocznosc1(6);
        //Widocznosc1 obj2c = new Widocznosc1(3.6);

        System.out.println("Domyślny double, widoczny w pakiecie: " + obj2.domyslnyDouble);
        //Pole protected będzie widoczne w tym samym pakiecie.
        System.out.println("Pole protected w pakiecie: " + obj2.stringChroniony);
        //Wyświetlenie pola typu public w klasie która wchodzi w skład pakietu. Pole wyświetli się.
        //Public wyświetla się wszędzie.
        System.out.println("Pole public w klasie pakietu: "+ obj2.polePublicString);
        //Metoda prywatna nie będzie widoczna w innej klasie z tego samego pakietu
        //obj2.prywatnaMetoda();
        //Domyślna metoda widoczna w pakiecie.
        obj2.domyslnaMetoda();
        //Metoda protected jest widoczna w klasie z pakietu.
        obj2.protectedMetoda();
        //Metoda public widoczna w pakiecie.
        obj2.publicMetoda();

    }
}
