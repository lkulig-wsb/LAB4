public class TablicaTypowProstych {

    public static void main(String[] args)
    {

       // LAB4_8. Stworzyć tablicę typów prostych i odwołać się do jej elementów.
        System.out.println("--- LAB4_8 - Tablica typów prostych ---\n");

        //Utworzenie tablicy typu całkowitego (int), która będzie miała rozmiar 8.
        int[]tablicaInt = new int[8];
        tablicaInt[0]=11;
        tablicaInt[1]=23;
        tablicaInt[2]=36;
        tablicaInt[3]=44;
        tablicaInt[4]=55;
        tablicaInt[5]=69;
        tablicaInt[6]=70;
        tablicaInt[7]=81;
        //Odwoływanie się do elementów tablicy i wypisanie ich zawartości.
        System.out.println("Wartość elementu o indeksie 0: " + tablicaInt[0]);
        System.out.println("Wartość elementu o indeksie 4: " + tablicaInt[4]);

        //Wyświetlenie wszystkich elementów tablicy za pomocą pętli for each.
        System.out.println("tablicaInt[]: ");
        for(int element: tablicaInt){
            System.out.print(element + " ");
        }

        //Wyświetlenie sumy elementów tablicy.
        System.out.println();
        int sumaElementowTablicy = 0;

        for (int element: tablicaInt)
        {
            sumaElementowTablicy+=element;
        }
        System.out.println("Suma elementów tablicy: " + sumaElementowTablicy);


        //Utworzenie tablicy charów.
        char[] tablicaChar = {'a','b','c','d','E','l'};

        //Przykład odwołania się do elementów tablicy tablicaChar.
        System.out.println("Znak pod indeksem 0: " + tablicaChar[0]);
        System.out.println( tablicaChar[0]+ "" + tablicaChar[5]+ "" + tablicaChar[0]);
    }
}
