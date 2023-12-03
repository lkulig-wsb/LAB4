package myPackage1;

public class TablicaObiektow {

    public static void main(String[] args){

        System.out.println("\nTABLICA OBIEKTÓW - POSTACIE ZE ŚWIATA FANTASY");
        System.out.println("---------------------------------------------\n");

        //Utworzenie tablicy obiektów
        Postac[] tablicaPostaci = new Postac[6];

        //Przypisanie obiektów do elementów tablicy
        tablicaPostaci[0] = new Postac("Bilbo Baggins","Hobbit",1937);
        tablicaPostaci[1] = new Postac("Kapitan Ahab","Moby Dick",1851);
        tablicaPostaci[2] = new Postac("Paul Atryda","Dune",1965);
        tablicaPostaci[3] = new Postac("Geralt z Rivii","Wiedźmin",1990);
        tablicaPostaci[4] = new Postac("Aragorn","LOTR",1937);
        tablicaPostaci[5] = new Postac("Daenerys","GOT",1996);

        //Odwołanie się do elementów tablicy i wyświetlenie ich wartości
        //Pętla for-each
        for(Postac postac : tablicaPostaci)
        {
            System.out.println(postac.getNazwa() + ", " + postac.getPochodzenie() + ", " + postac.getRokProdukcji());
        }

        System.out.println("\nWyszukanie elementu z tablicy");
        System.out.println("-----------------------------");
        //Wyszukanie postaci
        String szukanaPostac = "Aragorn";
        Postac znalezionaPosac = null;

        for (Postac postac : tablicaPostaci)
        {
            if(postac != null && postac.getNazwa().equals(szukanaPostac))
            {
                znalezionaPosac = postac;
                break; //Przerwanie pętli po znalezieniu postaci
            }
        }

        //Wyswietlnienie szukanej postaci
        if(znalezionaPosac !=null){
            System.out.println("Znaleziona postać: " + znalezionaPosac.getNazwa());
            System.out.println("Pochodzenie: " + znalezionaPosac.getPochodzenie());
            System.out.println("Rok produkcji: " + znalezionaPosac.getRokProdukcji());

        }else{
            System.out.println("Nie znaleziono postaci o nazwie: " + szukanaPostac);
        }

    }

}
