public class Film implements Cloneable {

    //Dane składowe klasy Film.
    private String tytul;
    private String rezyser;
    private int rokProdukcji;

    //Konstruktor klasy Film.
    public Film(String tytul, String rezyser, int rokProdukcji)
    {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.rokProdukcji = rokProdukcji;
    }

    //Przeslanianie metody toString(). Metoda toString() jest tekstową reprezentacją obiektu.
    @Override
    public String toString(){
        return "FILM << " + '\'' + tytul +'\''
                + ", reżyser='"+ rezyser + '\''
                + ", rok Produkcji -> " +rokProdukcji + " >>";
    }

    //Żeby korzystać z tej metody, klasa musi implementować interfejs Cloneable.
    //Metoda musi też zostać przesłonięta.
    //Metoda zwraca objekt jako typ "Object".
    //Dodatkowo, metoda zgłasza wyjątek dlatego musimy to zadeklarować w jej strukturze.
    @Override
    protected Film clone()throws CloneNotSupportedException{
        return (Film) super.clone();
    }

    //Przesłanianie metody equals().
    @Override
    public boolean equals(Object obj){ //argument typu Object, jest to przesłanianie metody z klasy Object.
        if(this == obj)return true; //czy objekt i przekazany obiekt to ta sama referencja.
        //sprawdzenie czy objekt nie jest null i czy należy do tej samej klasy co bieżący objekt.
        if(obj == null || getClass() != obj.getClass()) return false; //rzutowanie obiektu na typ Film
        Film film = (Film) obj;

        if (rokProdukcji != film.rokProdukcji) return false; //sprawdza czy pola rokProdukcji obiektów są równe
        if (tytul != null ? !tytul.equals(film.tytul) : film.tytul != null) return false;//Porównanie pól tytul
        return rezyser != null ? rezyser.equals(film.rezyser) : film.rezyser == null;//Porównanie pól reżyser
    }
    //Przesłanianie  metody finalize
    @Override
    protected void finalize() throws Throwable{
        try {
            //Zwalnianie zasobów, jeżeli to konieczne
            System.out.println("Finalize method called for " + this);
        }finally {
            super.finalize();
        }

    }

    public static void main(String[] args)
    {

    //Utworzenie obiektu klasy Film.
        Film f1 =new Film("Władca Pierścieni","Peter Jackson",2001);
        Film f2= new Film("Ojciec Chrzestny","Francis Ford Coppola",1972);
        Film f4= new Film("Ojciec Chrzestny","Francis Ford Coppola",1972);

        //Testowanie metody toString().
        System.out.println("toString()");
        System.out.println("----------");
        System.out.println(f1.toString()); //wywołanie toString().
        System.out.println(f2); //toString() można też pominąć.

        //Testowanie metody clone().
        System.out.println("clone()");
        System.out.println("-------");
        try{
            Film f3 = (Film) f1.clone();
            System.out.println("Klon: " + f3);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        //Testowanie metody equals().
        System.out.println("equals() " + f1.equals(f2));
        System.out.println("equals() " + f2.equals(f4));

        //GC
        f1 = null;
        System.gc();
    }
}
