package myPackage1;
import java.util.Arrays;
import java.util.Scanner;
import  java.util.Comparator;
public class TablicaObiektow {

    public static void main(String[] args){

        System.out.println("\nTABLICA OBIEKTÓW - POSTACIE ZE ŚWIATA FANTASY");
        System.out.println("---------------------------------------------\n");

        //Utworzenie tablicy obiektów.
        Postac[] tablicaPostaci = new Postac[6];

        //Przypisanie obiektów do elementów tablicy Postac[].
        tablicaPostaci[0] = new Postac("Bilbo Baggins","Hobbit",1937);
        tablicaPostaci[1] = new Postac("Kapitan Ahab","Moby Dick",1851);
        tablicaPostaci[2] = new Postac("Paul Atryda","Dune",1965);
        tablicaPostaci[3] = new Postac("Geralt z Rivii","Wiedźmin",1990);
        tablicaPostaci[4] = new Postac("Aragorn","LOTR",1937);
        tablicaPostaci[5] = new Postac("Daenerys","GOT",1996);

        //Odwołanie się do elementów tablicy i wyświetlenie ich wartości przy użyciu pętli for each.

        for(Postac postac : tablicaPostaci)
        {
            System.out.println(postac.getNazwa() + ", " + postac.getPochodzenie() + ", " + postac.getRokProdukcji());
        }

        System.out.println("\nWyszukanie elementu z tablicy");
        System.out.println("-----------------------------");
        //Wyszukanie elementu z tablicy tablicaPostaci[].
        //Utworzenie obiektu Scanner do wczytywania danych z konsoli.
        Scanner scanner = new Scanner(System.in);

        //Prosimy użytkownika o podanie nazwy szukanej postaci.
        System.out.print("Podaj nazwę postaci: ");
        String szukanaPostac = scanner.nextLine();

        //String szukanaPostac = "Aragorn";
        //Utworzenie zmiennej znalezionaPostac typu Postac z inicjalizacją na null.
        //Zmienna będzie przechowywać referencję do znalezionej postaci.
        Postac znalezionaPostac = null;

        //Pętlą for each przechodzi przez każdy element tablicy.
        //W pętli sprawdzane są dwa warunki: czy elelement istnieje i porównuje nazwę postaci z tablicy z
        //nazwą wprowadzoną.
        //Jeśli oba warunki zostaną spełnione to ustawiamy znalezionaPostac na referencję do znalezionej postaci i
        //przerywamy pętlę.
        for (Postac postac : tablicaPostaci)
        {
            if(postac != null && postac.getNazwa().equals(szukanaPostac))
            {
                znalezionaPostac = postac;
                break; //Przerwanie pętli po znalezieniu postaci
            }
        }

        //Wyswietlnienie szukanej postaci.
        if(znalezionaPostac !=null){
            System.out.println("-------------------------");
            System.out.println("Znaleziona postać: " + znalezionaPostac.getNazwa());
            System.out.println("Pochodzenie: " + znalezionaPostac.getPochodzenie());
            System.out.println("Rok produkcji: " + znalezionaPostac.getRokProdukcji());

        }else{
            System.out.println("Nie znaleziono postaci o nazwie: " + szukanaPostac);
        }

        //Sortowanie postaci według roku produkcji
        System.out.println("\nSortowanie na podstawie Roku Produkcji: ");
        System.out.println("----------------------------------------");
        sortujWedlugRokuProdukcji(tablicaPostaci);

        //Wyświetlenie posortowanej tablicy
        for(Postac postac : tablicaPostaci){

            System.out.println(postac.getRokProdukcji() + "-" + postac.getNazwa() + "-" + postac.getPochodzenie());
        }
    }
    //Metoda sortująca postacie według roku produkcji.
    //Metoda przyjmuje jako argumenty tablicę obiektów klasy Postac.
    //Wewnątrz używamy metodę sort z klasy Arrays. Jako pierwszy argument przekazujemy tablicę obiektów.
    //Jako drugi argument dajemy obiekt klasy Comparator.
    //Comparator to Interface funkcyjny, który służy do porównywania obiektów.
    //.comparingInt(Postac::getRokProdukcji)) - określa jak porównywać obiekty klasy Postać.
    public static void sortujWedlugRokuProdukcji(Postac[] tablicaPostaci){
        Arrays.sort(tablicaPostaci,Comparator.comparingInt(Postac::getRokProdukcji));
    }
}
