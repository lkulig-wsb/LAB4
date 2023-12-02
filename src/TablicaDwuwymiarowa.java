import java.util.Random;

public class TablicaDwuwymiarowa {

    public static void main(String[] args)
    {

        System.out.println("=== LAB4_5 - Tablica Dwuwymiarowa ===\n");
        //Utworzenie tablicy dwuwymiarowej dla 100 elementów (10x10)
        int[][] tablicaDwuwymiarowa = new int[10][10];

        //Wypełnienie tablicy liczbami losowymi z zakresu od 20 do 45
        wypelnienieTablicy(tablicaDwuwymiarowa, 20,45);

        //Wyświetlenie tablicy wypełnionej liczbami losowymi
        wyswietlTablice(tablicaDwuwymiarowa);





    }

    //Metoda wypełniająca tablicę dwuwymiarową liczbami z zakresu
    public static void wypelnienieTablicy(int[][] tablica, int min, int max)
    {
        Random random = new Random();
        for(int i = 0; i < tablica.length; i++)
        {
            for(int j =0; j < tablica[i].length; j++)
            {
                tablica[i][j] = random.nextInt((max - min)+1) + min;
            }
        }
    }

    //Metoda wyświetlająca tablicę

    public static void wyswietlTablice(int[][] tablica)
    {
        for(int i = 0; i < tablica.length; i++)
        {
            for(int j = 0; j < tablica[i].length; j++)
            {
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }




    }



}
