public class Film implements Cloneable {

    //Dane składowe
    private String tytul;
    private String rezyser;
    private int rokProdukcji;

    //Konstruktor
    public Film(String tytul, String rezyser, int rokProdukcji)
    {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.rokProdukcji = rokProdukcji;
    }

    //Przeslanianie metody to String
    @Override
    public String toString(){
        return "Film{"+"tytul='" + tytul +'\''
                + ", rezyser='"+ rezyser + '\''
                + ", rok Produkcji=" +rokProdukcji + '}';
    }
    //Przesłanianie metody clone()
    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    //Przesłanianie metody equals()
    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Film film = (Film) obj;

        if (rokProdukcji != film.rokProdukcji) return false;
        if (tytul != null ? !tytul.equals(film.tytul) : film.tytul != null) return false;
        return rezyser != null ? rezyser.equals(film.rezyser) : film.rezyser == null;
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

    //Utworzenie obiektu klasy Film
        Film f1 =new Film("Władca Pierścieni","Peter Jackson",2001);
        Film f2= new Film("Ojciec Chrzestny","Francis Ford Coppola",1972);
        Film f4= new Film("Ojciec Chrzestny","Francis Ford Coppola",1972);

        //Testowanie metody toString()
        System.out.println("toString()");
        System.out.println("----------");
        System.out.println(f1);
        System.out.println(f2);

        //Testowanie metody clone()
        System.out.println("clone()");
        System.out.println("-------");
        try{
            Film f3 = (Film) f1.clone();
            System.out.println("Klon: " + f3);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        //Testowanie metody equals()
        System.out.println("equals() " + f1.equals(f2));
        System.out.println("equals() " + f2.equals(f4));

        //GC
        f1 = null;
        System.gc();
    }
}
