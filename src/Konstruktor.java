public class Konstruktor {

    //Konstruktor bez parametrów
    public Konstruktor()
    {
        System.out.println("Jestem konstruktorem bez parametrów :)");
    }
    //Konstruktor z parametrami

    public Konstruktor(String tekst)
    {
        System.out.println("Jestem konstruktorem z parametrami. " + tekst);
    }

    public static void main(String[] args){

        //4.1 Przetestować działanie konstruktora z parametrami lub bez
        System.out.println("--LAB4_1 --");


        //Utworznie obiektu za pomocą konstruktora bez parametrów
        Konstruktor obiekt1 = new Konstruktor();

        //Utworznie obiektu za pomocą konstruktora z parametrami
        Konstruktor obiekt2 = new Konstruktor("Jak się masz :-> ?");




    }


}
