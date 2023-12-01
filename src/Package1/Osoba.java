package Package1;

public class Osoba {

    String imie;
    String nazwisko;


    //Konstruktor bez parametrów
    public Osoba()
    {
        System.out.println("Uruchomienie konstruktora bez parametrów..");
    }

    //Konstruktor z parametrami
    public Osoba(String imie, String nazwisko){
        System.out.println("Uruchomienie konstruktora z parametrami: " + imie + " " + nazwisko);
    }

}
