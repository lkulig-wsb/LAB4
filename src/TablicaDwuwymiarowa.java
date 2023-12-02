import java.util.Arrays;
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
        System.out.println("Tablica Oryginalna:");
        wyswietlTablice(tablicaDwuwymiarowa);
        //Posortowanie elementów tablicy za pomocą metody sortujTablicę
        sortujTablice(tablicaDwuwymiarowa);
        //Wyswietlenie tablicy posortowanej
        System.out.println("Tablica Posortowana:");
        wyswietlTablice(tablicaDwuwymiarowa);
        //Utworzenie histogramu
        System.out.println("Histogram: ");
        int[] histogram = utworzHistogram(tablicaDwuwymiarowa);
        wyswietlHistogram(histogram);




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

    //Metoda sortująca
    //Użycie pętli for-each która iteruje przez każdy woiersz tablicy dwuwymiarowej i go sortuje
    //za pomocą metody sort klasy Arrays
    public static void sortujTablice(int[][] tablica) // przyjęcie tablicy dwuwymiarowej jako argument
    {
        for(int[] row: tablica)
        {
            Arrays.sort(row);
        }
    }

    //Metoda tworząca histogram
    private static int[] utworzHistogram(int[][] tablica)
    {
        int[] histogram = new int[46-20+1]; // zakres od 20 do 45

        for(int[] rzad: tablica)
        {
            for(int liczba : rzad)
            {
                histogram[liczba -20]++;
            }
        }
        return histogram;
    }



    //Metoda wyświetlająca histogram (ilosc wystąpień)
    public static void wyswietlHistogram(int[] histogram)
    {
        for(int i = 20; i<=45; i++)
        {
            System.out.println(i + ": " + histogram[i-20] + " wystąpień.");
        }
    }



}
